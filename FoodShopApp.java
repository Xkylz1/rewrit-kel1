package org.example;

/**
 * File: FoodShopApp.java for main method
 *       ViewMenu for view
 *       Order is an object
 *       FoodType as enum class
 * @author nopalfi
 */
public class FoodShopApp {
    public static void main(String[] args) {
        // Instantiate ViewMenu first so we can use its method
        ViewMenu viewMenu = new ViewMenu();
        viewMenu.showMenu();
    }
}
