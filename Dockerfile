# build command: `docker build -t simple-deploy-java-with-docker .`
# docker run `docker run --rm -p 8080:8080 simple-deploy-java-with-docker`
# `curl http://localhost:8080`

FROM library/openjdk:8-alpine

MAINTAINER "test <qyvlik@qq.com>"

RUN adduser -D -u 1000 www www

ADD target/*.jar /home/www/app.jar

EXPOSE 8080

RUN chown www:www -R /home/www

WORKDIR /home/www

USER www

CMD ["java", "-jar", "/home/www/app.jar"]
