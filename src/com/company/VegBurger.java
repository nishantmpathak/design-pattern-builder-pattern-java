package com.company;

public class VegBurger extends Burger {

    @Override
    public void name(){
        System.out.println("veg burger");
    };

    @Override
    public float price(){
        return 10f;
    }
}
