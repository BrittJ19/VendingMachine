package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
    private File inventoryList;

    private Map<String,Slot> inventoryMap = new TreeMap<>();

    public Inventory(File inventoryList, Map inventoryMap){
        this.inventoryList = inventoryList;
        this.inventoryMap = inventoryMap;

    }

    public File getInventoryList() {
        return inventoryList;
    }


    public Map<String, Slot> getInventoryMap() {
        File inventoryList = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(inventoryList)){
         while ( scanner.hasNextLine()){
             String inventoryOutput = scanner.nextLine();
             String[] line = inventoryOutput.split("\\|");
             double price = Double.parseDouble(line[2]);
             Slot snackSlot = new Slot(line[1], line[0], 5, price);
             inventoryMap.put(line[0], snackSlot);
         } System.out.println(inventoryMap);
        return inventoryMap;

        } catch (Exception ex){
            ex.getMessage();
        }return inventoryMap;
    }


}
