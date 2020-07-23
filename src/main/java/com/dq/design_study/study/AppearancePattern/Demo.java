package com.dq.design_study.study.AppearancePattern;

/**
 * 外观模式 : 说白了就是封装
 */
public class Demo {
    public static void main(String[] args) {

        //======没封装前=======================
        Idea idea = new Idea();
        Pc pc =new Pc();
        //我上班
        System.out.println("上班:");
        pc.openPc();
        idea.openIdea();
        System.out.println("下班:");
        //下班
        idea.closeIdea();
        pc.closePc();

        //======封装后=======================
        Work work = new Work();
        System.out.println("上班:");
        work.work();
        System.out.println("下班:");
        work.offWork();





    }
}
