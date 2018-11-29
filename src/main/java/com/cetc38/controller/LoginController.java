package com.cetc38.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @RequestMapping("/index")
    public String index(){
//        System.out.println("hello world");

        return "/frame/index" ;

    }
    @RequestMapping("/bottom")
    public String bottom(){

        return "/frame/bottom" ;
    }

    @RequestMapping("/left")
    public String left(){

        return "/frame/left" ;
    }

    @RequestMapping("/right")
    public String right(){

        return "/frame/right" ;
    }

    @RequestMapping("/top")
    public String top(){

        return "/frame/top" ;
    }

}
