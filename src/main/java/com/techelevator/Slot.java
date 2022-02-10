package com.techelevator;

public class Slot {
    private String productName;
    private int quantity = 5;
    private double price;
    private String slotNumber;

    public Slot( String productName, String slotNumber, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.slotNumber = slotNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return productName;
    }

    public String getSlotNumber() {
        return slotNumber;
    }
}

