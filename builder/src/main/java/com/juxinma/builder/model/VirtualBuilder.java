package com.juxinma.builder.model;

/**
 * @Description 虚拟商品创建者
 * @Author 黄名富
 * @Date 2022/7/20 00:52
 * @Version 1.0
 **/
public class VirtualBuilder extends Builder{

    @Override
    public void buildName(String name) {
        this.getGoods().setName(name);
    }

    @Override
    public void buildWeight(double weight) {
    }

    @Override
    public void buildUrl(String url) {
        this.getGoods().setType(1);
        this.getGoods().setUrl(url);
    }

}
