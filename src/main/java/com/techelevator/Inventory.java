package com.techelevator;

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


        try(Scanner scanner = new Scanner(inventoryList)){
         while (scanner.hasNextLine()){
             iventoryOutput = (inventoryList +"|")
         }
        }
        return inventoryMap;
    }


}
