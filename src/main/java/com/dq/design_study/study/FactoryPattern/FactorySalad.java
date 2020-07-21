package com.dq.design_study.study.FactoryPattern;

public class FactorySalad {

    public Salad getSalad (){
        Apple apple = new Apple();
        Banan banan = new Banan();
        String sale = "草莓酱";
        Salad salad = new Salad(apple,banan,sale);
        return salad;
    }

}
