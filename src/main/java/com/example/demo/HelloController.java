package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

    @RequestMapping("/demo")
    public String getdemo(Model model){

        return "index";
    }
}
