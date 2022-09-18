package com.juxinma.observer.model;

/**
 * @Description 基金公司
 * @Author 黄名富
 * @Date 2022/8/3 00:05
 * @Version 1.0
 **/
public class FundCompany implements Observer{

    public FundCompany(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String title) {
        System.out.println("基金公司收到:" + title);
        System.out.println("我可以募集资金了");
    }
}
