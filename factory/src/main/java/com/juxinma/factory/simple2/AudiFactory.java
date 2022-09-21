package com.juxinma.factory.simple2;

public class AudiFactory {

    private AudiFactory() {}

    public static Audi buildA6() {
        return new Audi() {
            @Override
            public void drive() {
                System.out.println("Hello A6!");
            }
        };
    }

    public static Audi buildA8() {
        return new Audi() {
            @Override
            public void drive() {
                System.out.println("Hello A8!");
            }
        };
    }

}
