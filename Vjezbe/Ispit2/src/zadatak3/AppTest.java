package zadatak3;

public class AppTest {

    public static void main(String[] args) {
        System.out.println("Creating user...");
        User user = new User("User-01");
        System.out.println(user);
        System.out.println("Creating wallet...");
        PaymentMethod pm1 = new GoogleWallet();
        System.out.println(pm1);
        PaymentMethod pm2 = new PayPal();

        StreamingApplication streamingApp = new StreamingApplication(user);
        streamingApp.setPaymentMethod(pm1);

        streamingApp.subscribeToService(new StreamingService("Netflix", 15), 2);
        streamingApp.subscribeToService(new StreamingService("HBO", 30), 3);

        streamingApp.setPaymentMethod(pm2);

        streamingApp.subscribeToService(new StreamingService("SuperSport", 5), 6);
        streamingApp.subscribeToService(new StreamingService("SuperSport", 5), 6);

        streamingApp.subscriptionStatus();


    }
}
