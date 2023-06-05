package zadatak3;

public class StreamingService implements Comparable<StreamingService>{

    private int id;
    private static int cntID;
    private double monthly;
    private String serviceName;

    public StreamingService(String serviceName, double priceOfService) {
        this.id = cntID++;
        this.serviceName = serviceName;
        this.monthly = priceOfService;
    }

    public void describeSubscription(){
        System.out.println(this.getServiceName() + " -> " + this.getMonthly());
    }

    // Getters and Setters
    public double getMonthly() {
        return monthly;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public int compareTo(StreamingService o) {
        return Double.compare(this.getMonthly(), o.getMonthly());
    }
}
