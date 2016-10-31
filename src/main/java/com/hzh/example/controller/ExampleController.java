package com.hzh.example.controller;

import com.hzh.example.config.ExampleProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhanhao Wong on 2016/10/30.
 */

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private ExampleProp prop;

    @RequestMapping("/index")
    public String index() {
        return "This is a test！";
    }

    @RequestMapping("/prop")
    public String prop() {
        return prop.toString();
    }

    @RequestMapping("/error")
    public String error() {

        int i = 1/ 0;
        return "exception";
    }

    @CrossOrigin
    @RequestMapping("/api/test")
    public String apiTest() {
        return "允许跨域访问";
    }
}
