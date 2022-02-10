package com.techelevator;

public class Beverage extends Product {


    public Beverage(String productName, String type,String message, double price, Slot slot) {
        super(productName, type, price, slot);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public String getType() {
        return super.getType();
    }
    @Override
    public String getMessage() {
        return message;
    }
}
