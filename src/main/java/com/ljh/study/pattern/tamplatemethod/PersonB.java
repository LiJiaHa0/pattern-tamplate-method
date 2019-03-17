package com.ljh.study.pattern.tamplatemethod;

/**
 * @description: 代表一个叫B的人
 * @author: Jh Lee
 * @create: 2019-03-17 15:28
 **/
public class PersonB extends Person {

    //重写第四布，自己编写逻辑
    @Override
    protected void doingFour() {
        System.out.println("---吃完早餐啦，我要学习一会---");
    }

    //重写第六步，自己编写逻辑
    @Override
    protected void doingSix() {
        System.out.println("---吃完午餐啦，我要午休一会起来再学习一会---");
    }


    //重写第八步，自己编写逻辑
    @Override
    protected void doingEight() {
        System.out.println("---吃完晚安啦，我要出去运动一下消化一下---");
    }
}
