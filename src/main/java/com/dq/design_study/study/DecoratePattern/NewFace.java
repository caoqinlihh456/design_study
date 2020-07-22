package com.dq.design_study.study.DecoratePattern;

public class NewFace implements Iface{

    private Face face;

    public NewFace (Face face){
        this.face = face;
    }


    @Override
    public int getFace() {
        return face.getFace()+20;
    }
}
