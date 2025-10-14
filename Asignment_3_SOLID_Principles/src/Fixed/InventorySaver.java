package Fixed;

import java.util.Map;

// Interface for saving inventory items.
public interface InventorySaver {
    void save(Map<String, Integer> inventory, String filename);
}
