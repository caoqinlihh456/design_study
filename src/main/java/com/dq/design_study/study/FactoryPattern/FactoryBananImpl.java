package com.dq.design_study.study.FactoryPattern;

public class FactoryBananImpl implements IFactory {
    @Override
    public Fruit getFruit() {
        return new Banan();
    }
}
