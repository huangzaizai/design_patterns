package com.juxinma.proxy.jdk;

import com.juxinma.proxy.static1.JavaEncode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleInvocationHandler implements InvocationHandler {

    private JavaEncode javaEncode;

    public SimpleInvocationHandler(JavaEncode javaEncode) {
        this.javaEncode = javaEncode;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代码操作");
        System.out.println(" 方法：" + method.toString().replaceAll("\\w+[\\s|.]","") + " 参数：" + args);
        Object result = method.invoke(javaEncode, args);
        System.out.println("动态代理后操作");
        return result;
    }

}
