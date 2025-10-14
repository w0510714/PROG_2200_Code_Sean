package Bad;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add an item with quantity to the inventory
    public void addItem(String item, int quantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }

    // Remove an item from the inventory
    public void removeItem(String item, int quantity) throws Exception {
        if (!inventory.containsKey(item) || inventory.get(item) < quantity) {
            throw new Exception("Item not available or insufficient quantity");
        }
        inventory.put(item, inventory.get(item) - quantity);
    }

    // Display the inventory
    public void displayInventory() {
        System.out.println("Inventory:");
        for (String item : inventory.keySet()) {
            System.out.println(item + ": " + inventory.get(item));
        }
    }

    // Save inventory to a file (not implemented)
    public void saveInventoryToFile(String filename) {
        // Code to save inventory to a file
    }
}

