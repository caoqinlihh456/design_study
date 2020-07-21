package com.dq.design_study.study.FactoryPattern;


import lombok.Data;

@Data
public class Banan extends Fruit {

    private String name = "香蕉";

    private String age;

    public void eat(){
        System.out.println("吃香蕉");
    }

}
