
public class Customer {

    private Payment customerPayment;
    private String name;
    private String location;

    public Customer(Payment customerPayment, String name, String location) {
        this.customerPayment = customerPayment;
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Payment getCustomerPayment() {
        return customerPayment;
    }

    @Override
    public String toString() {
        return name;
    }
}