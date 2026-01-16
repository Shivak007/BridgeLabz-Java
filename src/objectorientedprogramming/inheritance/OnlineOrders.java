package objectorientedprogramming.inheritance;

class Order {
    private String orderId;
    private String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    public String getOrderStatus() {
        return "Your order has been Placed";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking number: " + trackingNumber);
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivered Date: " + deliveryDate);
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineOrders {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2026-01-10");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2026-01-11", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2026-01-12", "TRK67890", "2026-01-14");

        System.out.println("*** Order Details ***");
        order.displayInfo();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\n*** Shipped Order Details ***");
        shippedOrder.displayInfo();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println("\n*** Delivered Order Details ***");
        deliveredOrder.displayInfo();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}