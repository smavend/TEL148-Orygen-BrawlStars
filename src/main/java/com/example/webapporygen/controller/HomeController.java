package com.example.webapporygen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String mainPage() {
        return "Hello, World!";
    }

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello";
    }
}
