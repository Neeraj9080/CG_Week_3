package singlelinkedlist.inventorymanagementsystem;

public class OperationsOnInventoryItems
{
    InventoryItem head;

    // Constructor
    OperationsOnInventoryItems()
    {
        this.head = null;
    }

    // Adding an item at the beginning
    public void addAtBeginning(String itemName, String itemId, int quantity, double price)
    {
        InventoryItem newItem = new InventoryItem(itemName,itemId,quantity,price);
        newItem.next = head;
        head = newItem;
    }

    // Adding an item at the end
    public void addAtLast(String itemName, String itemId, int quantity, double price)
    {
        InventoryItem newItem = new InventoryItem(itemName,itemId,quantity,price);

        if(head == null)
        {
            head = newItem;
        }
        else
        {
            InventoryItem temp = head;

            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    public void addAtSpecificPosition(String itemName, String itemId, int quantity, double price,int position)
    {
        InventoryItem newItem = new InventoryItem(itemName,itemId,quantity,price);

        if(position == 0)
        {
            newItem.next = head;
            head = newItem;
            return;
        }

        InventoryItem temp  = head;
        int index = 0;

        while(temp != null && index < position-1)
        {
            index++;
            temp = temp.next;
        }
        if(temp != null) {
            newItem.next = temp.next;
            temp.next = newItem;
        }
        else
        {
            System.out.println("Position out of range");
        }
    }

    // Remove an item by itemID
    public void deleteItem(String itemId)
    {
        if(head == null)
        {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId.equals(itemId))
        {
            head = head.next;
            return;
        }
        InventoryItem temp = head;
        while (temp.next != null && temp.next.itemId != itemId)
        {
            temp = temp.next;
        }
        if (temp.next != null)
        {
            temp.next = temp.next.next;
            System.out.println("Item removed  " + itemId);
        }
        else
        {
            System.out.println("Item not found");
        }
    }

    // Update the quantity of an item by itemID
    public void updateQuantity(String itemId, int newQuantity) {
        InventoryItem temp = head;
        while (temp != null)
        {
            if (temp.itemId.equals(itemId))
            {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated for item ID is " + itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Display all inventory items
    public void displayItems()
    {
        if (head == null)
        {
            System.out.println("No inventory item to display");
            return;
        }
        InventoryItem temp = head;
        while (temp != null)
        {
            System.out.println("Item Name is " + temp.itemName);
            System.out.println("Item ID is " + temp.itemId);
            System.out.println("Quantity is " + temp.quantity);
            System.out.println("Price is " + temp.price);
            temp = temp.next;
        }
    }

    // Calculate and display total value of inventory
    public void displayTotalValue()
    {
        double totalValue = 0;
        InventoryItem temp = head;
        while (temp != null)
        {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value is " + totalValue);
    }
}
