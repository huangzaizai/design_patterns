package com.juxinma.strategy;

/**
 * 策略模式：回家条件（环境）
 */
public class GoHomeContext {

    private Transportation transportation;

    public GoHomeContext(Transportation transportation) {
        this.transportation = transportation;
    }

    public void goHome() {
        transportation.goHome();;
    }

}
