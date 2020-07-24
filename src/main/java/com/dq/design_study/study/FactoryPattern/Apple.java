package com.dq.design_study.study.FactoryPattern;


import lombok.Data;

@Data
public class Apple extends Fruit {

    private String name = "苹果";

    @Override
    public void eat(){
        System.out.println("吃苹果");
    }

}
