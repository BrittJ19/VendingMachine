package com.techelevator;

public class Candy extends Product{

    public Candy(String productName, String type, String message, int price, Slot slot) {
        super(productName, type, message, price, slot);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }
}
