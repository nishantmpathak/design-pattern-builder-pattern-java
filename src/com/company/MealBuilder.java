package com.company;

public class MealBuilder {
    public Meal prepareVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        return meal;
    }
    public Meal prepareNonvegBurger(){
        Meal meal = new Meal();
        meal.addItem(new NonvegBurger());
        return meal;
    }

    public Meal prepareVegBurgerPepsiMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
