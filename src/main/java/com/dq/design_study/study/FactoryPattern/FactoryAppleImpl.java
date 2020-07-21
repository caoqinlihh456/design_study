package com.dq.design_study.study.FactoryPattern;

public class FactoryAppleImpl implements IFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
