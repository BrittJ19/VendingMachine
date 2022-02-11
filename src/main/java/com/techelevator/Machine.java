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
        Product product = inventory.getInventoryMap().get(slotNum).getProduct();
        funds -= product.price;
        total += product.price;
        return product;
    }

    public double returnChange(){
        double change = funds;
        funds = 0;
        return change;
    }
}
