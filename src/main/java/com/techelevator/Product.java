package com.techelevator;

public abstract class Product {

    public String productName;
    public String type;
    public String message;
    public int price;
    public Slot slot;



    public Product(String productName, String type,String message, int price,Slot slot){
        this.price = price;
        this.productName= productName;
        this.message = message;
        this.type = type;
        this.slot =slot;
    }

    public int getPrice() {
        return price;
    }

    public Slot getSlot() {
        return slot;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }
    public String getMessage(){
        return message;
    }
}
