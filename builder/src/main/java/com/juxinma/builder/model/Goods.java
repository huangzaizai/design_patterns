package com.juxinma.builder.model;

/**
 * @Description 建造者模式-商品
 * @Author 黄名富
 * @Date 2022/7/20 00:45
 * @Version 1.0
 **/
public class Goods {

    /**
     * 商品类别 0 普通商品 1 虚拟商品
     */
    private int type;

    /**
     * 名称
     */
    private String name;

    /**
     * 重量
     */
    private double weight;

    /**
     * 网址
     */
    private String url;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", url='" + url + '\'' +
                '}';
    }
}
