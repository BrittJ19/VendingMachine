package com.techelevator;

public class Gum extends Product{

    public Gum(String productName, String type, int price, Slot slot) {
        super(productName, type, price, slot);
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
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
        return super.getMessage();
    }
}
