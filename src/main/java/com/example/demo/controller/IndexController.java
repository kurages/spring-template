package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Controller;


@Controller
@RequestMapping("/")
public class IndexController {
    public String index() {
        return "index";
    }
}
