public class WebShop {

    private String webLocation;
    private Customer customer;
    private Order order;
    private Payment shopPayment;

    public WebShop(String webLocation, Customer customer, Order order, Payment shopPayment) {
        this.webLocation = webLocation;
        this.customer = customer;
        this.order = order;
        this.shopPayment = shopPayment;
    }

    public void orderContentFromShop() {
        if (shopPayment.equals(customer.getCustomerPayment())) {
            System.out.println("Succefully ordered!");
            System.out.println("Package is flying from " + webLocation + " to " + customer.getLocation());
            order.showContentInOrder();
        } else {
            System.out.println("Payment failed, card required is: " + shopPayment);
        }
    }
}