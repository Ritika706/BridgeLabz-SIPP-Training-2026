package main.Java.OOPS.gcr_codebase.Inheritance;

class Order {

    protected int orderId;
    protected String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    protected String trackingNumber;

    ShippedOrder(int orderId,
                 String orderDate,
                 String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    DeliveredOrder(int orderId,
                   String orderDate,
                   String trackingNumber,
                   String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(
                        1001,
                        "01-06-2026",
                        "TRK123",
                        "05-06-2026");

        System.out.println("Order ID: " + order.orderId);
        System.out.println(order.getOrderStatus());
    }
}