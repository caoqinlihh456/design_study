package com.dq.design_study.study.BuilderPattern;

/**
 * 建造者模式
 *
 *    自我感觉： 原本的建造者模式不是这样，是通过私有化构造方法，通过bulid类 在赋值进去，
 *             我感觉的建造者模式，就是有默认值，创建稳定，想设置值就可以设置，不设置就可以有默认值，所以我感觉这个也挺简单好用
 *
 *
 *              使用建造者的好处就是不必担心忘了某个配置，保证构建过程稳定，
 */
public class Demo {

    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        show(milkTea);

        MilkTea m = new MilkTea();
        m.setTea("绿茶");
        show(m);

    }
    public static void show(MilkTea milkTea){
        System.out.println("我要一杯"+milkTea.getWeidao()+"的"+milkTea.getSize()+"杯"+milkTea.getTea());
    }
}
