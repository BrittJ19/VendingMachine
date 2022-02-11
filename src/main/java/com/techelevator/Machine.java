package com.techelevator;

public class Machine {
    private double funds = 0;
    private double total = 0;
    private Inventory inventory;

    public Machine(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public double getFunds() {
        return funds;
    }

    public double feedMoney(double money){
        funds += money;
        return funds;
    }

    public Product purchaseProduct(String slotNum){
        Slot slot = inventory.getInventoryMap().get(slotNum);
        Product product = slot.getProduct();
        funds -= product.price;
        total += product.price;
        slot.reduceQuantity();
        return product;
    }

    public void returnChange(){
        int change = (int) (funds * 100);
        int quarters = 0;
        int dimes = 0;
        int nickles =0;
            quarters = change / 25;
            change -= quarters * 25;
            dimes = change / 10;
            change -= dimes * 10;
            nickles = change / 5;

        System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes " + nickles + " nickles ");
        funds = 0;
    }


}
