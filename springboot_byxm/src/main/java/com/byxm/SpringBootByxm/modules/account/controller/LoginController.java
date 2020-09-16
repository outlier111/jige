package com.byxm.SpringBootByxm.modules.account.controller;

import com.byxm.SpringBootByxm.modules.account.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /*
        1270.0.1/
     */
    @PostMapping(value = "/toLogin/{np}")
    public String login(@PathVariable String np) {
        return loginService.login(np);
    }
}
