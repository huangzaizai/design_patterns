package com.juxinma.strategy;

import java.util.Random;

/**
 * 回家方案： 通过if...else 方式实现回家
 */
public class GoHomeTest {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(3); //0,高铁，1 绿皮，2 开车
        GoHomeTest goHomeTest = new GoHomeTest();
        if (randomNum == 0) {
            goHomeTest.byRail();
        } else if (randomNum == 1) {
            goHomeTest.byTrain();
        } else {
            goHomeTest.byCar();
        }
    }

    private void byRail() {
        System.out.println("坐高铁回家");
    }

    private void byTrain() {
        System.out.println("坐绿皮火车回家");
    }

    private void byCar() {
        System.out.println("开车回家");
    }

}
