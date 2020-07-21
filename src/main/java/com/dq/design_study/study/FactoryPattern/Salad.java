package com.dq.design_study.study.FactoryPattern;

import lombok.Data;

/**
 * 沙拉
 */
@Data
public class Salad {

    private Apple apple;

    private Banan banan;

    private String sala;

    /**
     *构造方法
     */
    public Salad(Apple apple, Banan banan, String sala){
        this.apple = apple;
        this.banan = banan;
        this.sala = sala;
    }

}
