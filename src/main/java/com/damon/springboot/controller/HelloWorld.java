package com.damon.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "王赟";
    }
    @GetMapping("lll")
    @ResponseBody
    public String Damon(){
        return "小组长";
    }
}
