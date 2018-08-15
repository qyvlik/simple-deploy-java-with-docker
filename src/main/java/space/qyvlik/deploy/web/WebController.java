package space.qyvlik.deploy.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(method = RequestMethod.GET,
            value = "",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String defaultIndex() {
        JSONObject response = new JSONObject();
        response.put("result", "index");
        return response.toJSONString();
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "index",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String index() {
        JSONObject response = new JSONObject();
        response.put("result", "index");
        return response.toJSONString();
    }
}
