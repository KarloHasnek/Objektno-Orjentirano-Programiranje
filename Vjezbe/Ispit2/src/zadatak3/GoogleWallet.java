package zadatak3;

public class GoogleWallet implements PaymentMethod{

    public GoogleWallet() {

    }

    @Override
    public void performPayment(Double price) {
        System.out.println("Performing payment...");
        System.out.println("Amount: " + price);
        System.out.println("Payed by " + getClass().getSimpleName());
    }
}
