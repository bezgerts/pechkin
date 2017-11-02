package me.bezgerts.pechkin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/user")
    public Principal getUserPrincipal(Principal principal) {
        return principal;
    }
}
