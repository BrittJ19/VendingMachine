package com.techelevator;

public class Gum extends Product{

    public Gum(String productName, String type, String message, int price, Slot slot) {
        super(productName, type, message, price, slot);
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }

    @Override
    public int getPrice() {
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
