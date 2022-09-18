package com.juxinma.observer.model;

/**
 * @Description 个人
 * @Author 黄名富
 * @Date 2022/8/3 00:08
 * @Version 1.0
 **/
public class People implements Observer{

    public People(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String title) {
        System.out.println("个人收到:" + title);
        System.out.println("我可以买股票了");
    }

}
