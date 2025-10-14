package Fixed;

import java.util.HashMap;
import java.util.Map;

// Main Class, defining global Inventory variables
public class InventoryManager {
    private final Map<String, Integer> inventory;
    private final InventorySaver saver;
    private final InventoryViewer viewer;

    public InventoryManager(InventorySaver saver, InventoryViewer viewer) {
        this.inventory = new HashMap<>();
        this.saver = saver;
        this.viewer = viewer;
    }

    // Add an item to the inventory
    public void addItem(String item, int quantity) {
        inventory.merge(item, quantity, Integer::sum); // Adds or updates values for the inventory
    }

    // Remove an item from the inventory
    public void removeItem(String item, int quantity) {
        if (!inventory.containsKey(item) || inventory.get(item) < quantity) {
            throw new InventoryException("Item not available or insufficient quantity"); // Calls the InventoryException error handling function
        }
        inventory.put(item, inventory.get(item) - quantity);
    }

    // Fetches data to print inventory
    public void displayInventory() {
        viewer.display(inventory);
    }

    // Fetches data to save inventory
    public void saveInventory(String filename) {
        saver.save(inventory, filename);
    }

}