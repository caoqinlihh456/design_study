package com.dq.design_study.study.FactoryPattern;

/**
 * 工厂模式
 *
 */
public class FactoryFruit {

    public  Fruit getFruit(Integer type){
        switch (type){
            case 1:
                return new Apple();
            case 2:
                return new Banan();
             default:
                 throw new IllegalArgumentException("没有这种水果");
        }
    }

}
