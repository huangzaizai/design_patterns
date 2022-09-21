package com.juxinma.factory.simple2;

public class Audi4S {

    public static void main(String[] args) {
        Audi a6 = AudiFactory.buildA6();
        Audi a8 = AudiFactory.buildA8();
        a6.drive();
        a8.drive();
    }

}
