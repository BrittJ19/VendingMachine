package com.techelevator;

public class Money {
    private double money = 0;

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
