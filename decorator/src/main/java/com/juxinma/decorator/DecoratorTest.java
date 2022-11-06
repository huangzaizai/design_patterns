package com.juxinma.decorator;

import java.util.Date;

public class DecoratorTest {

    /**
     * 校验器
     */
    interface Verifier {
        boolean verify(Object object);
    }

    /**
     * 网络请求校验器
     */
    static class RequestVerifier implements Verifier{

        @Override
        public boolean verify(Object object) {
            return object != null; //非空校验
        }

    }

    /**
     * 校验器装饰器
     */
    static class VerifierDecorator implements Verifier {

        private Verifier verifier;

        public VerifierDecorator(Verifier verifier) {
            this.verifier = verifier;
        }

        @Override
        public boolean verify(Object object) {
            return verifier.verify(object);
        }
    }

    /**
     * 日期校验器
     */
    static class DateVerifierDecorator extends VerifierDecorator {

        public DateVerifierDecorator(Verifier verifier) {
            super(verifier);
        }

        @Override
        public boolean verify(Object object) {
            if(super.verify(object)) return dateVerify(object);
            return false;
        }

        private boolean dateVerify(Object object) {
            return object instanceof Date;
        }
    }

    /**
     * Integer 校验器
     */
    static class IntegerVerifierDecorator extends VerifierDecorator {

        public IntegerVerifierDecorator(Verifier verifier) {
            super(verifier);
        }

        @Override
        public boolean verify(Object object) {
            if(super.verify(object)) return integerVerify(object);
            return false;
        }

        private boolean integerVerify(Object object) {
            return object instanceof Integer;
        }
    }

    public static void main(String[] args) {
        String obj0 = null;
        String obj1 = "hello java";
        Date obj2 = new Date();
        Integer obj3 = 1;

        Verifier requestVerifier = new RequestVerifier();

        Verifier dateVerifier = new DateVerifierDecorator(requestVerifier);
        System.out.println("dateVerifier");
        System.out.println(obj0 + ":" + dateVerifier.verify(obj0));
        System.out.println(obj1 + ":" + dateVerifier.verify(obj1));
        System.out.println(obj2 + ":" + dateVerifier.verify(obj2));
        System.out.println(obj3 + ":" + dateVerifier.verify(obj3));
        System.out.println("----------------------------");

        Verifier integerVerifier = new IntegerVerifierDecorator(requestVerifier);
        System.out.println("integerVerifier");
        System.out.println(obj0 + ":" + integerVerifier.verify(obj0));
        System.out.println(obj1 + ":" + integerVerifier.verify(obj1));
        System.out.println(obj2 + ":" + integerVerifier.verify(obj2));
        System.out.println(obj3 + ":" + integerVerifier.verify(obj3));

//        运行结果：
//        dateVerifier
//        null:false
//        hello java:false
//        Sun Nov 06 11:18:26 CST 2022:true
//        1:false
//        ----------------------------
//        integerVerifier
//        null:false
//        hello java:false
//        Sun Nov 06 11:18:26 CST 2022:false
//        1:true

    }

}
