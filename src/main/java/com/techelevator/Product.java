package com.techelevator;

public  class Product {

    public String productName;
    public String type;
    public String message;
    public double price;
    public Slot slot;



    public Product(String productName, String type, double price,Slot slot){
        this.price = price;
        this.productName= productName;
        this.message = message;
        this.type = type;
        this.slot =slot;
    }

    public double getPrice() {
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
