package com.techelevator;

import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.junit.Assert.*;

public class InventoryTest {

    @Test
    public void getInventoryList() {
    }

    @Test
    public void getInventoryMap() {
        File file = new File("vendingmachine.csv");
        Inventory inventory = new Inventory(file);
        Map<String, Slot> map = inventory.getInventoryMap();
        assertEquals(16, map.size());
        assertEquals("Potato Crisps", map.get("A1").getProduct());
        assertEquals("Moonpie", map.get("B1").getProduct());
        assertEquals("Cola", map.get("C1").getProduct());

    }
}