package Fixed;

// Exception handling for main class, keeps error handling and actual code seperate
public class InventoryException extends RuntimeException {
    public InventoryException(String message) {
        super(message);
    }
}

