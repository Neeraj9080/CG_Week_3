package singlelinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem
{
    public static void main(String[] args)
    {
        OperationsOnInventoryItems inventory = new OperationsOnInventoryItems();

        // Adding items at beginning
        inventory.addAtBeginning("Laptop", "101", 5, 50000.00);

        // Adding items at last
        inventory.addAtLast("SmartPhone", "102", 10, 10000.00);

        // Adding items at specific position
        inventory.addAtSpecificPosition("PC", "103", 15, 30000.00,2);

        // Displaying items
        inventory.displayItems();

        // Remove an item
        inventory.deleteItem("102");

        // Update item quantity
        inventory.updateQuantity("101", 10);

        // Display inventory value
        inventory.displayTotalValue();

        // Display remaining items
        inventory.displayItems();
    }
}
