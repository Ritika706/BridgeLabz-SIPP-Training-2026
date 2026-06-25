package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

class CartItem {

    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough quantity to remove.");
        }
    }

    void displayTotalCost() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        CartItem item = new CartItem("Laptop", 50000, 1);

        item.addItem(2);
        item.removeItem(1);

        item.displayTotalCost();
    }
}