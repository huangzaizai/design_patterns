package com.juxinma.proxy.jdk;

import com.juxinma.proxy.static1.DevelopAble;
import com.juxinma.proxy.static1.JavaEncode;

import java.lang.reflect.Proxy;

public class InvocationHandlerTest {

    public static void main(String[] args) {
        JavaEncode javaEncode = new JavaEncode();
        DevelopAble developAble = (DevelopAble) Proxy.newProxyInstance(DevelopAble.class.getClassLoader(), new Class[]{DevelopAble.class}, new SimpleInvocationHandler(javaEncode));
        developAble.buildSystem();
    }

}
