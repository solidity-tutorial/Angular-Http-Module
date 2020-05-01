package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
    @ResponseBody
    @RequestMapping("/bro")
    public String giveBro(){
		System.out.println("bro controller ");
        return "broooooooo";
    }
}
