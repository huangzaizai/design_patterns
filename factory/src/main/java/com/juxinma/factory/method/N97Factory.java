package com.juxinma.factory.method;

/**
 * @Description 工厂方法模式-N97工厂
 * @Author 黄名富
 * @Date 2022/7/18 21:00
 * @Version 1.0
 **/
public class N97Factory implements Factory{

    @Override
    public FaceMask create() {
        return new N97FaceMask();
    }

}
