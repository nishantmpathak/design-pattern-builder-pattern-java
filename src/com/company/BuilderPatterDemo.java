package com.company;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

public class BuilderPatterDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.prepareVegBurger();
        meal1.listOfItem();
        System.out.println(meal1.cost());

        Meal meal2 = mealBuilder.prepareNonvegBurger();
        meal2.listOfItem();
        System.out.println(meal2.cost());

        Meal meal3 = mealBuilder.prepareVegBurgerPepsiMeal();
        meal3.listOfItem();
        System.out.println(meal3.cost());
    }
}
