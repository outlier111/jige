package com.byxm.SpringBootByxm.modules.account.service.impl;

import com.byxm.SpringBootByxm.modules.account.service.LoginService;
import com.byxm.SpringBootByxm.utils.MD5Util;
import com.byxm.SpringBootByxm.utils.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String information) {
        Subject subject = SecurityUtils.getSubject();
//        将字符串分割
        String[] ss = information.split(" ");
        UsernamePasswordToken usernamePasswordToken =
                new UsernamePasswordToken(ss[0], MD5Util.getMD5(ss[1]));
        try {
//            进入realm进行认证
            subject.login(usernamePasswordToken);
//                subject.checkRoles();
        } catch (Exception e) {
            e.printStackTrace();
            return "用户名或密码错误";
        }
        return "登陆成功";

    }
}
