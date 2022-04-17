package com.company;

abstract public class ColdDrink implements Item{
    @Override
    public void packing() {
        new Disposal().pack();
    }
}
