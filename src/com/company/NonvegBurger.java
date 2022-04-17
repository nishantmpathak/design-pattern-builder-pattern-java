package com.company;

public class NonvegBurger extends Burger {
    @Override
    public void name() {
        System.out.println("NonvegBurger");

    }

    @Override
    public float price() {
        return 11.5f;
    }
}
