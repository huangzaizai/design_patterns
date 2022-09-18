package com.juxinma.adapter.model.interfacees;

public class Macbook extends ComputerAbstract{

    @Override
    public void writeCode() {
        System.out.println("程序员最喜欢的电脑之一");
        System.out.println("屏幕特别好，系统特别流畅");
    }

    public static void main(String[] args) {
        Computer macbook = new Macbook();
        macbook.writeCode();
    }

}
