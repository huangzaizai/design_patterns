package com.juxinma.strategy;

public class RailTransportation implements Transportation{

    @Override
    public void goHome() {
        System.out.println("坐高铁回家");
    }

}
