package zadatak3;

import java.util.TreeMap;

public class StreamingApplication {

    private User appUser;
    private TreeMap<StreamingService, Boolean> services;
    private PaymentMethod paymentMethod;

    public StreamingApplication(User appUser) {
        this.appUser = appUser;
        services = new TreeMap<>();
        this.paymentMethod = null;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void subscribeToService(StreamingService streamingService, int months) {
        System.out.println("------------------------------------------------------------");
        if (paymentMethod == null){
            System.out.println("Payment method not chosen. Please choose payment method first!");
        } else if (services.containsKey(streamingService)) {
            System.out.println("Already subscribed to: " + streamingService.getServiceName());
        } else {

            System.out.println("Subscribing to: " + streamingService.getServiceName());
            System.out.println("Payment for service: " + streamingService.getServiceName());
            paymentMethod.performPayment(months * streamingService.getMonthly());
            services.put(streamingService, true);
            System.out.println("Subscribed for: " +months + " months");
        }
        System.out.println("------------------------------------------------------------");
    }

    public void subscriptionStatus(){
        System.out.println("--------------------Subscription status--------------------");
        services.forEach((key, value) -> {
            System.out.println("Streaming service: " + key.getServiceName());
            System.out.println("Subscription valid: " + value);
            System.out.println("------------------------------------------------------------");
        });
    }

    @Override
    public String toString() {
        return "StreamingApplication{" + "appUser=" + appUser + ", services=" + services + ", paymentMethod=" + paymentMethod + '}';
    }
}
