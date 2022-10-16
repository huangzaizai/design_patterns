package com.juxinma.proxy.static1;

public class SpringEncode implements DevelopAble{

    private JavaEncode javaEncode;

    public SpringEncode(JavaEncode javaEncode) {
        this.javaEncode = javaEncode;
    }

    @Override
    public void buildSystem() {
        System.out.println("Spring使开发更便捷");
        javaEncode.buildSystem();;
        System.out.println("Spring增强安全性");
    }

}
