package com.juxinma.factory.abstract1;

/**
 * @Description 抽象工厂模式-富士康工厂2017
 * @Author 黄名富
 * @Date 2022/7/18 22:25
 * @Version 1.0
 **/
public class Factory2021 implements Factory{

    @Override
    public IPhone createIPhone() {
        return new IPhone13();
    }

    @Override
    public MacBook createMacBook() {
        return new MacBook2021();
    }

}
