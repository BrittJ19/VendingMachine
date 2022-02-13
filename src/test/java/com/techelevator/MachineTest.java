package com.techelevator;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MachineTest {
    File file = new File("vendingmachine.csv");
    Inventory inventory = new Inventory(file);
    Machine machine = new Machine(inventory);

    @Test
    public void getInventory() {

    }

    @Test
    public void getFunds() {

    }

    @Test
    public void getTotal() {
        machine.getTotal();
    }

    @Test
    public void getTotalMoneyIn() {
    }

    @Test
    public void feedMoney() {
    }

    @Test
    public void purchaseProduct() {
    }

    @Test
    public void returnChange() {
    }

    @Test
    public void getCurrentTimeAsString() {
    }

    @Test
    public void getSalesReport() {
    }
}