package com.juxinma.builder.model;

/**
 * @Description 普通商品建造者
 * @Author 黄名富
 * @Date 2022/7/20 01:07
 * @Version 1.0
 **/
public class OrdinaryBuilder extends Builder {

    @Override
    public void buildName(String name) {
        this.getGoods().setName(name);
    }

    @Override
    public void buildWeight(double weight) {
        this.getGoods().setType(0);
        this.getGoods().setWeight(weight);
    }

    @Override
    public void buildUrl(String url) {

    }
}
