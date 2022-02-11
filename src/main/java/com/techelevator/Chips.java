package com.techelevator;

public class Chips extends Product{
    private String message;


    public Chips(String productName, String type, double price) {
        super(productName, type, price);
    }


    @Override
    public String getMessage() {
        return "";
    }

}
