package com.juxinma.factory.method;

/**
 * @Description 工厂方法模式-口罩商店
 * @Author 黄名富
 * @Date 2022/7/18 21:03
 * @Version 1.0
 **/
public class FaceMaskShop {

    final static Factory n97Factory = new N97Factory();
    final static Factory ordinaryFactory = new OrdinaryFactory();

    public static void main(String[] args) {
        FaceMask n97 = n97Factory.create();
        FaceMask ordinary = ordinaryFactory.create();
        System.out.println(n97.name);
        System.out.println(ordinary.name);
    }

}
