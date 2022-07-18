package com.juxinma.factory.simple;

/**
 * @Description 简单工厂模式-奥迪工厂
 * @Author 黄名富
 * @Date 2022/7/18 01:48
 * @Version 1.0
 **/
public class AudiFactory {

    public Audi createAudiCar(int type) {
        Audi audi = null;
        switch (type) {
            case 0:
                audi = new A6Audi();
                break;
            case 1:
                audi = new A8Audi();
                break;
            default:
                audi = null;
        }
        return audi;
    }

}
