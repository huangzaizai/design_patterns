package com.juxinma.proxy.virtual;

public class InterviewTest {

    public static void main(String[] args) {
        Hr hr = new Hr();
        System.out.println("第一轮筛选");
        for(int i = 0; i < 5; i++) hr.filtrate(i); //简历筛选
        hr.interview();//邀请技术总监来面试

        System.out.println("-------");
        System.out.println("第二轮筛选");
        for(int i = 6; i < 10; i++) hr.filtrate(i); //第二轮筛选
        hr.interview();

    }

}
