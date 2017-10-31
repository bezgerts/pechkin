package me.bezgerts.pechkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {
    @GetMapping("/")
    public String main() {
        return "/main";
    }

    @GetMapping("/index")
    public String home() {
        return "/index";
    }

    @GetMapping("/oldLogin")
    public String login() {
        return "/oldLogin";
    }

    @GetMapping("/blank")
    public String blank() {
        return "/blank";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
