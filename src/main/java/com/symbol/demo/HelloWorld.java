package com.symbol.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
    @RequestMapping("/hello")
    public String index() {
    	HttpServletRequest request;
        return "Hello World";
    }
    @RequestMapping("/domain")
    public Domain getDomain() {
    	Domain d = new Domain();
    	d.setId(1);
    	d.setName("hahah");
        return d;
    }
	
}
