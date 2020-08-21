package com.dq.design_study.study.Reflex;

import java.lang.reflect.Field;

/**
 * 反射练习
 */
public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //通过反射注入 userSerice
//        UserController userController = new UserController();
//        Class<? extends UserController> clzz = userController.getClass();
//        Field userService = clzz.getDeclaredField("userService");
//        userService.setAccessible(true);
//        Class<?> type = userService.getType();
//        Object o = type.newInstance();
//        userService.set(userController,o);
//        System.out.println(userController.getUserService());


//        ==================================================================







        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        //获取属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //打开暴力反射
            field.setAccessible(true);
            //获取属性上的注解 a
            A a = field.getAnnotation(A.class);
            if(a != null){
                Class<?> type = field.getType();
                Object o = type.newInstance();
                field.set(userController,o);
            }
        }



    }
}
