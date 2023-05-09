package zadatak3;

public class Payment {
    
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment [paymentMethod=" + paymentMethod + "]";
    }

    
}
