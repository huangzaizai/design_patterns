package com.juxinma.adapter.model.classes;


public class Macbook {

    public static void main(String[] args) {
        System.out.println("Macbook 使用的是TypeC 接口，但是有个需求需要读取USB内容:");
        ThirdAdapter thirdAdapter = new ThirdAdapter();
        thirdAdapter.runApplet();
    }

}
