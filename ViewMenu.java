package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMenu {
    int choice;
    int amount;
    // We store any order object created in ArrayList
    ArrayList<Order> orderArrayList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    // Public constructor is mandatory
    public ViewMenu() {

    }
    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Order");
        System.out.println("2. Checkout");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
        choice = input.nextInt();
        // Enhanced switch statement: make sure you're using JDK 14+
        switch (choice) {
            case 1 -> {
                order();
                showMenu();
            }
            case 2 -> checkout();
            default -> System.out.println("Exitting...");
        }
    }

    public void order() {
        System.out.println("1. Food, 2. Drink, 3. Snack");
        System.out.print("Type of Food? (4 to go back)");
        choice = input.nextInt();
        switch (choice) {
            case 1 -> orderArrayList.add(food());
            case 2 -> orderArrayList.add(drink());
            case 3 -> orderArrayList.add(snack());
            case 4 -> showMenu();
            // We throw an exception when the user input wrong choice, although you can handle it if you want
            default -> throw new IllegalStateException("Choice is not valid");
        }
    }

    public Order food() {
        System.out.println("Food Menu: ");
        System.out.println("1. Bakso. (MeatBall). IDR 12k");
        System.out.println("2. Soto. (Cubed Rice in a Soup) IDR 12k");
        System.out.println("3. Nasi Goreng. (Fried Rice) IDR 11k");
        System.out.println("4. Mie Goreng. (Fried Noodle) IDR 14k");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                amount = amountOrdered();
                long price = amount * 12000L;
                return new Order("Bakso", amount, price, FoodType.FOOD);
            case 2:
                amount = amountOrdered();
                price = amount * 12000L;
                return new Order("Soto", amount, price, FoodType.FOOD);
            case 3:
                amount = amountOrdered();
                price = amount * 11000L;
                return new Order("Nasi Goreng", amount, price, FoodType.FOOD);
            case 4:
                amount = amountOrdered();
                price = amount * 14000L;
                return new Order("Mie Goreng", amount, price, FoodType.FOOD);
            default:
                throw new IllegalStateException("Choice is not valid");
        }
    }

    public Order drink() {
        System.out.println("Drink Menu: ");
        System.out.println("1. Iced Tea. IDR 3k");
        System.out.println("2. Black Coffee. IDR 6k");
        System.out.println("3. Mineral Water. IDR 1k");
        System.out.println("4. Lemon Tea. IDR 5k");
        choice = input.nextInt();
        if (choice == 1) {
            amount = amountOrdered();
            long price = amount * 3000L;
            return new Order("Iced Tea", amount, price, FoodType.DRINK);
        } else if (choice == 2) {
            long price;
            amount = amountOrdered();
            price = amount * 6000L;
            return new Order("Black Coffee", amount, price, FoodType.DRINK);
        } else if (choice == 3) {
            long price;
            amount = amountOrdered();
            price = amount * 1000L;
            return new Order("Mineral Water", amount, price, FoodType.DRINK);
        } else if (choice == 4) {
            long price;
            amount = amountOrdered();
            price = amount * 5000L;
            return new Order("Lemon Tea", amount, price, FoodType.DRINK);
        }
        throw new IllegalStateException("Choice is not valid");
    }

    public Order snack() {
        System.out.println("Snack Menu: ");
        System.out.println("1. Tempura. IDR 10k");
        System.out.println("2. Fried Potato. IDR 10k");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                amount = amountOrdered();
                long price = amount * 10000L;
                return new Order("Tempura", amount, price, FoodType.SNACK);
            }
            case 2 -> {
                long price;
                amount = amountOrdered();
                price = amount * 10000L;
                return new Order("Fried Potato", amount, price, FoodType.SNACK);
            }
        }
        throw new IllegalStateException("Choice is not valid");
    }
    public void checkout() {
        int food = 0, drink = 0, snack = 0, price = 0, amount = 0;
        if (orderArrayList.isEmpty()) {
            System.out.println("You don't have any order yet...");
        } else {
            for (var order : orderArrayList) {
                switch (order.getFoodType()) {
                    case FOOD -> food = food + order.getAmount();
                    case DRINK -> drink = drink + order.getAmount();
                    case SNACK -> snack = snack + order.getAmount();
                }
                price += order.getPrice();
                amount = food + drink + snack;
            }
            System.out.printf("Makanan: %s, Minuman: %s, Snack: %s%n", food, drink, snack);
            ArrayList<String> namaMakanan = new ArrayList<>();
            for (var order : orderArrayList) {
                namaMakanan.add(order.getName());
            }
            System.out.println("Pesanan: "+ namaMakanan);
            System.out.println("Jumlah Pesanan: "+amount);
            System.out.println("Total harga: "+price);
        }
    }

    public int amountOrdered() {
        int amount;
        do {
            System.out.print("How many portion? ");
            input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount < 1) System.out.println("Retry...");
        } while (amount < 1);
        return amount;
    }

}
