package com.byxm.SpringBootByxm.modules.account.controller;

import com.byxm.SpringBootByxm.modules.account.service.LoginService;
import com.byxm.SpringBootByxm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/account")
public class AccountController {

    /*
        127.0.0.1/account/login-----------get
     */
    @GetMapping("/login")
    public String login() {
        return "account/login";
    }

    /*
        127.0.0.1/account/index-----------get
     */
    @GetMapping("/index")
    public String index() {
        return "account/index";
    }

    /*
        127.0.0.1/account/profile---------get
     */
    @GetMapping("/profile")
    public String profile() {
        return "account/profile";
    }

}
