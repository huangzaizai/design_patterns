package com.juxinma.strategy;

import java.util.Random;

/**
 * 回家方案：通过策略模式方式实现回家
 */
public class GoHomeTest2 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(3); //0,高铁，1 绿皮，2 开车

        Transportation railTransportation = new RailTransportation();
        Transportation trainTransportation = new TrainTransportation();
        Transportation carTransportation = new CarTransportation();

        GoHomeContext context = null;
        if (randomNum == 0) {
            context = new GoHomeContext(railTransportation);
        } else if (randomNum == 1) {
            context = new GoHomeContext(trainTransportation);
        } else {
            context = new GoHomeContext(carTransportation);
        }
        context.goHome();
    }

}
