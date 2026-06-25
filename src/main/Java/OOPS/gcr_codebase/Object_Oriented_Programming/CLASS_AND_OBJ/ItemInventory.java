package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

public class ItemInventory {

    int itemCode;
    String itemName;
    double price;

    ItemInventory(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails(int quantity) {
        double totalCost = price * quantity;

        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        ItemInventory item =
                new ItemInventory(101, "Pen", 20.0);

        item.displayItemDetails(5);
    }
}