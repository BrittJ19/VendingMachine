package com.techelevator;

public class Candy extends Product{

    public Candy(String productName, String type, int price, Slot slot) {
        super(productName, type, price, slot);
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
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }
}
