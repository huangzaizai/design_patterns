package com.juxinma.builder.model;

/**
 * @Description 商品建造者
 * @Author 黄名富
 * @Date 2022/7/20 00:48
 * @Version 1.0
 **/
public abstract class Builder {

    private Goods goods = new Goods();

    public abstract void buildName(String name);

    public abstract void buildWeight(double weight);

    public abstract void buildUrl(String url);

    public Goods getGoods() {
        return goods;
    }

}
