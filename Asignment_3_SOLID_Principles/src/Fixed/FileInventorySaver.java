package Fixed;

import java.util.Map;

// Implements from InventorySaver. Prints the saved inventory items.
public class FileInventorySaver implements InventorySaver {
    @Override
    public void save(Map<String, Integer> inventory, String filename) {
        System.out.println("Saving inventory to " + filename + " (not implemented yet)");
    }
}
