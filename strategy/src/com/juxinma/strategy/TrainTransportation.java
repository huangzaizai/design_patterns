package com.juxinma.strategy;

public class TrainTransportation implements Transportation{

    @Override
    public void goHome() {
        System.out.println("坐绿皮火车回家");
    }

}
