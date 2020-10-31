package com.company;

public class McDonaldsFryBurger implements Assignment2.Burger, Assignment2.Fries {

    @Override
    public int returnCalories() {
        return 500;
    }

    @Override
    public void eatLoudly() {
        System.out.println("Yum");
    }

    @Override
    public String returnIngredients() {
        return "Bread, Tomatoes, Beef";
    }
}
