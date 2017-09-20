package com.symbol.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld2 {
	
    @RequestMapping("/hello1")
    public @ResponseBody String index() {
        return "Hello World1111";
    }
    @RequestMapping("/domain1")
    public @ResponseBody Domain getDomain() {
    	Domain d = new Domain();
    	d.setId(1);
    	d.setName("hahah");
        return d;
    }
	
}
