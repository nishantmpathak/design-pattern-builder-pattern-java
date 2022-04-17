package com.company;

abstract public class Burger implements Item{

    @Override
    public void packing(){
        new Wrapper().pack();
    };
}
