package com.company;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }

    public float cost(){
        float cost =0;
        for(Item item : items){
            cost+=item.price();
        }
        return cost;
    }

    public void listOfItem(){
        for (Item item: items) {
            item.name();
        }
    }
}
