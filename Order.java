package org.example;

public class Order {

    private String name;
    private Integer amount;
    private Long price;
    private FoodType foodType;

    public Order(String name, Integer amount, Long price, FoodType foodType) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.foodType = foodType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
