package singlelinkedlist.inventorymanagementsystem;

public class InventoryItem
{
    String itemName;
    String itemId;
    int quantity;
    double price;
    InventoryItem next;

    InventoryItem(String itemName, String itemId , int quantity, double price)
    {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
