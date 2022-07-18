package com.juxinma.factory.simple;

import java.util.Random;

/**
 * @Description 简单工厂模式-奥迪4S店
 * @Author 黄名富
 * @Date 2022/7/18 01:51
 * @Version 1.0
 **/
public class Audi4S {

    private static AudiFactory factory = new AudiFactory();

    public static void main(String[] args) {
        //用户选车
        int type = new Random().nextInt(3);
        //工厂生产
        Audi audi = factory.createAudiCar(type);
        //汽车交付
        System.out.println(audi == null ? "该型号停产了" : audi.name);
    }

}
