package com.juxinma.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {

    static class Student {
        public void study() {
            System.out.println("好好学习");
        }
    }

    public static void main(String[] args) {
        Student student = (Student) Enhancer.create(Student.class, new MethodInterceptor() {
            /**
             * @param o 代理类对象自身
             * @param method 代理类执行的方法
             * @param objects 方法执行参数
             * @param methodProxy 方法代理【采用这个参数，可以避免使用方法反射进行调用，但是内部未使用反射】
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("方法执行前");
                Object invokeSuper = methodProxy.invokeSuper(o, args);
                System.out.println("方法执行后");
                return invokeSuper;
            }
        });
        student.study();
    }

}
