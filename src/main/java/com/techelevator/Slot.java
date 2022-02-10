package com.techelevator;

public class Slot {
    private Product product;
    private int quantity = 5;
    private int price;
    private String slotNumber;

    public Slot( Product product, String slotNumber, int quantity, int price){
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.slotNumber = slotNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public String getSlotNumber() {
        return slotNumber;
    }
}

