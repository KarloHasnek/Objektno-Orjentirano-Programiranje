public class Test {

    public static void main(String[] args) {

        // Ordering...
        Order order = new Order("Order-01");
        order.addJacketsToOrder(5);
        order.addSocksToOrder(3);
        order.addSweatPantsToOrder(18);

        // Order being successful
        Payment payment = new Payment("MASTERCARD");
        Customer firstCustomer = new Customer(payment, "Jurica", "Zadar");
        WebShop shop1 = new WebShop("weblocation", firstCustomer, order, payment);
        shop1.orderContentFromShop();

        System.out.println("\n\n\nTrying to order with different payment type then the shop accepts...");

        // Failed order
        WebShop shop2 = new WebShop("location2", firstCustomer, order, new Payment("American"));
        shop2.orderContentFromShop();


    }
}