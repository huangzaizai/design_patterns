package com.juxinma.strategy;

public class CarTransportation implements Transportation{

    @Override
    public void goHome() {
        System.out.println("开车回家");
    }

}
