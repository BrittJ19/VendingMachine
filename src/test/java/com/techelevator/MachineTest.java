package com.techelevator;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MachineTest {

    private String logRecord;
    File logFile = new File("log.txt");
    File salesReport = new File("salesReport.txt");

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
    @Test
    public void auditFile(){

    }
}