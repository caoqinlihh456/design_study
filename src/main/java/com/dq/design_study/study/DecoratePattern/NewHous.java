package com.dq.design_study.study.DecoratePattern;

public class NewHous implements INewHous {

    private MyHous myHous;

    public NewHous (MyHous myHous){
        this.myHous = myHous;
    }

    @Override
    public void payGame() {
        System.out.println("我还可以玩游戏");
    }

    @Override
    public void live() {
        myHous.live();
    }
}
