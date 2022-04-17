package com.company;

public class Pepsi extends ColdDrink{
    @Override
    public void name() {
        System.out.println("Pepsi");
    }

    @Override
    public float price() {
        return 5f;
    }
}
