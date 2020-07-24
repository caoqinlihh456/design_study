package com.dq.design_study.study.Reflex;

import java.lang.reflect.Field;

/**
 * 反射练习
 */
public class Demo {
    public static void main(String[] args) throws NoSuchFieldException {
        //通过反射注入 userSerice
        UserController userController = new UserController();
        Class<? extends UserController> clzz = userController.getClass();
        Field userService = clzz.getDeclaredField("userService");
        Class<?> serviceClzz = userService.getDeclaringClass();
//        serviceClzz.


    }
}
