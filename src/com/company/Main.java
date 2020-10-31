package com.company;

public class Main {

    private static McDonaldsFryBurger fryBurger = new McDonaldsFryBurger();

    public static void main(String[] args) {
        System.out.println(fryBurger.returnCalories());
        System.out.println(fryBurger.returnIngredients());
        fryBurger.eatLoudly();
    }
}
