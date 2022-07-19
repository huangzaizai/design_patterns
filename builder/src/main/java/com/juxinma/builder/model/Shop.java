package com.juxinma.builder.model;

/**
 * @Description 商店
 * @Author 黄名富
 * @Date 2022/7/20 01:09
 * @Version 1.0
 **/
public class Shop {

    public static void main(String[] args) {
        Builder ordinaryBuilder = new OrdinaryBuilder();
        Builder virtualBuilder = new VirtualBuilder();

        //创建一般商品
        ordinaryBuilder.buildName("大西瓜");
        ordinaryBuilder.buildWeight(300);
        System.out.println(ordinaryBuilder.getGoods());

        //创建虚拟商品
        virtualBuilder.buildName("你懂得的网站");
        virtualBuilder.buildUrl("https://baidu.com");
        System.out.println(virtualBuilder.getGoods());

    }

}
