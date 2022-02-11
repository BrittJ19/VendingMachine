package com.techelevator;

public class Money {
    private double money;

    public Money(double money){
        this.money = money;

    }

    public double getMoney() {
        return money;
    }
    public double getPennies(){
        double pennies = money*100;
        return pennies;
    }
}
