package com.juxinma.factory.method;

/**
 * @Description 工厂方法模式-普通工厂
 * @Author 黄名富
 * @Date 2022/7/18 21:02
 * @Version 1.0
 **/
public class OrdinaryFactory implements Factory{

    @Override
    public FaceMask create() {
        return new OrdinaryFaceMask();
    }

}
