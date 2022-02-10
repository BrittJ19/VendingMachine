package com.techelevator;

public class Chips extends Product{
    private String message;


    public Chips(String productName, String type, String message, int price, Slot slot) {
        super(productName, type, message, price, slot);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Slot getSlot() {
        return super.getSlot();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
