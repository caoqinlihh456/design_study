package com.dq.design_study.study.FactoryPattern;

/**
 * 工厂模式
 *
 *1.简单工厂模式 :
 *               优点:不用关心怎么创建,只关心工厂
 *               缺点:工厂代码需要不停的维护,会很长
 *
 *2.工厂方法模式:
 *              场景:当构建过程相当复杂时，工厂将构建过程封装起来，调用者可以很方便的直接使用，同样以苹果生产为例：
 *              优点:每个有单独的工厂,工厂类不会变超级类,工厂类越来越多,可维护
 *              缺点:代码编写增多
 *
 *3.抽象工厂模式：
 *              优点：只更一行代码，即可实现不同业务
 *              缺点：接口每次新增一个方法，每个实现类都要去完善修改
 *
 *
 */
public class Demo{
    public static void main(String[] args) {

        //============1.简单工厂模式=================================
        Banan fruit = (Banan) new FactoryFruit().getFruit(2);
        System.out.println(fruit);

        //============工厂方法模式===================================
        Salad salad = new FactorySalad().getSalad();
        System.out.println(salad);

        //===========抽象工厂模式====================================
//        IFactory factory = new FactoryAppleImpl();//吃苹果
        IFactory factory = new FactoryBananImpl();//吃香蕉
        Fruit f = factory.getFruit();
        f.eat();

    }
}
