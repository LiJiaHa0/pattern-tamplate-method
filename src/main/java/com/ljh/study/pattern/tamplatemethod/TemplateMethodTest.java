package com.ljh.study.pattern.tamplatemethod;

/**
 * @description: 模版方法模式测试类
 * @author: Jh Lee
 * @create: 2019-03-17 15:25
 **/
public class TemplateMethodTest {

    public static void main(String[] args) {
        Person personA = new PersonA();
        personA.live();
        System.out.println("-------------------------------------------------------");
        Person personB = new PersonB();
        personB.live();
    }
}
