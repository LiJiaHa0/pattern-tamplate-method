package com.ljh.study.pattern.tamplatemethod;

/**
 * @description:
 * @author: Jh Lee
 * @create: 2019-03-17 16:19
 **/
public interface PersonInterface {
    //1、起床穿衣
    //2、洗脸刷牙
    //3、吃早餐
    //4、做不同的事(每个人不同)
    //5、吃午餐
    //6、做不同的事(每个人不同)
    //7、吃晚餐
    //8、做不同的事(每个人不同)
    //9、洗漱
    //10、休息

    //我们在这里直接对每个人的生活步骤进行锁定，加final修饰让我们每个人实现这个接口时不能实现这个方法
    //下面每个人相同生活步骤都是加了final修饰，不能让实现这个父类的子类来进行方法重写
    default void live(){
        //第一步
        getUpTakeClothing();
        //第二步
        wash();
        //第三步
        eatBreakfast();
        //第四步 做不同的是，让子类实现这个方法自己编写逻辑
        doingFour();
        //第五步
        eatLunch();
        //第六步
        doingSix();
        //第七步
        eatSupper();
        //第八步
        doingEight();
        //第九步
        takeBatch();
        //最后一步
        sleep();

    }

    //起床穿衣
    default void getUpTakeClothing(){
        System.out.println("今天真是美好的一天，穿衣服起床！");
    }

    //洗脸刷牙
    default void wash(){
        System.out.println("我洗好脸，刷好牙啦，准备吃早餐！");
    }

    //吃早餐
    default void eatBreakfast(){
        System.out.println("吃完早餐啦，早餐真好吃！");
    }

    //定义第四步的接口，让子类实现
    public void doingFour();

    //吃午餐
    default void eatLunch(){
        System.out.println("中午好饿啊，我要开始吃午餐啦！");
    }

    //定义第六步的接口，让子类实现
    public void doingSix();

    //吃晚餐
    default void eatSupper(){
        System.out.println("过了一天了，吃顿丰富的晚餐弥补一下自己！");
    }

    //定义第八步的接口，让子类实现
    public void doingEight();

    //洗澡洗漱
    default void takeBatch(){
        System.out.println("今天出了好多汗，洗个澡准备睡觉了！");
    }

    //休息
    default void sleep(){
        System.out.println("好困，我要睡觉了~~~~");
    }
}
