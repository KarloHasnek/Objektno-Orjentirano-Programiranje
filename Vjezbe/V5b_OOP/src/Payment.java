public class Payment {

    private String paymentType;

    public Payment(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return paymentType;
    }
}