package com.juxinma.observer.model;

/**
 * @Description 银行
 * @Author 黄名富
 * @Date 2022/8/3 00:03
 * @Version 1.0
 **/
public class Bank implements Observer{

    public Bank(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String title) {
        System.out.println("银行收到:"  + title);
        System.out.println("我可以放贷款了");
    }

}
