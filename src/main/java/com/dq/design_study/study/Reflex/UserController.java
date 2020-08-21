package com.dq.design_study.study.Reflex;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {


    @A
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
