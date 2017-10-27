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

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "/contacts";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
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
