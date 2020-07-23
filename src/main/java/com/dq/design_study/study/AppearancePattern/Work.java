package com.dq.design_study.study.AppearancePattern;

public class Work {

    void work (){
        new Pc().openPc();
        new Idea().openIdea();
    }

    void offWork (){
        new Idea().closeIdea();
        new Pc().closePc();
    }


}
