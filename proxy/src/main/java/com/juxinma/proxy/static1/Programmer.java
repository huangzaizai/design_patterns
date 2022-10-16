package com.juxinma.proxy.static1;

public class Programmer {

    public static void main(String[] args) {
        JavaEncode javaEncode = new JavaEncode();
        SpringEncode springEncode = new SpringEncode(javaEncode);
        springEncode.buildSystem();
    }

}
