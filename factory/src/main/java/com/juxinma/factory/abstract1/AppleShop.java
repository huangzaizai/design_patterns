package com.juxinma.factory.abstract1;

/**
 * @Description 抽象工厂模式-苹果体验店
 * @Author 黄名富
 * @Date 2022/7/18 22:26
 * @Version 1.0
 **/
public class AppleShop {

    private final static Factory factory2017 = new Factory2017();
    private final static Factory factory2021 = new Factory2021();

    public static void main(String[] args) {
        IPhone iPhone11 = factory2017.createIPhone();
        MacBook macBook2017 = factory2017.createMacBook();
        System.out.println(iPhone11.model + " + " + macBook2017.model);

        IPhone iPhone13 = factory2021.createIPhone();
        MacBook macBook2021 = factory2021.createMacBook();
        System.out.println(iPhone13.model + " + " + macBook2021.model);
    }

}
