package com.dq.design_study.study.DecoratePattern;


/**
 * 装饰器模式:   在不改变原有的功能情况下, 增加 或者 增强功能
 */
public class Demo {
    public static void main(String[] args) {


        //=============增强功能模式===========================================
        Face face = new Face();
        System.out.println("我的颜值:"+face.getFace()+"分");
        NewFace nf = new NewFace(face);
        System.out.println("我的新颜值:"+nf.getFace()+"分");

        //===========增加功能模式============================================-=
        MyHous myHous = new MyHous();
        myHous.live();

        NewHous newHous = new NewHous(myHous);
        newHous.live();
        newHous.payGame();







    }
}
