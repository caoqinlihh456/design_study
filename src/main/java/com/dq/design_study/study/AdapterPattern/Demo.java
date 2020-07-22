package com.dq.design_study.study.AdapterPattern;


/**
 * 适配器模式：  讲一个类的接口转换客户希望的接口，使接口不兼容的一起工作
 */
public class Demo {
    public static void main(String[] args) {

        //家庭电压220v   充电电压只能5v

        //现在我要充电

        int dian = 220;

        dian = adapter(dian);

        //适配器
        System.out.println("我要充电，电压目前为："+dian+"v");

    }
    public static int adapter(int dian){
        return dian = 5;
    }
}
