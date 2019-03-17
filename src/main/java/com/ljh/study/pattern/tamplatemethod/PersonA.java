package com.ljh.study.pattern.tamplatemethod;

/**
 * @description: 一个代表A的人
 * @author: Jh Lee
 * @create: 2019-03-17 15:23
 **/
public class PersonA extends Person {

    //重写第四布，自己编写逻辑
    @Override
    protected void doingFour() {
        System.out.println("---吃完早餐啦，我要去公园玩一会儿---");
    }

    //重写第六步，自己编写逻辑
    @Override
    protected void doingSix() {
        System.out.println("---吃完午餐啦，我想打会游戏---");
    }

    //重写第八步，自己编写逻辑
    @Override
    protected void doingEight() {
        System.out.println("---吃完晚餐啦，看会电影放松一下自己---");
    }
}
