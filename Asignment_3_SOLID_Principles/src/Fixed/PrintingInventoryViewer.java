package Fixed;

import java.util.Map;

// Printing the items in the inventory (viewing)
public class PrintingInventoryViewer implements InventoryViewer {
    @Override
    public void display(Map<String, Integer> inventory) {
        System.out.println("Inventory:");
        inventory.forEach((item, qty) -> System.out.println(item + ": " + qty));
    }
}
