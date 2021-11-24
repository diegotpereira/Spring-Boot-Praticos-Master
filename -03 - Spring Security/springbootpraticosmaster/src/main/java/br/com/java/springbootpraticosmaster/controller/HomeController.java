package br.com.java.springbootpraticosmaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/admin")
    public String admin() {

        return "admin";
    }
}
