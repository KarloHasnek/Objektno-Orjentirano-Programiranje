package zadatak3;

public class Customer {
    private String name;
    private int id;
    private static int cntID = 100;

    public Customer(String name) {
        this.name = name;
        id = cntID++;
    }

    @Override
    public String toString() {
        return "Customer {name: " + name + ", id: " + id + "}";
    }

    public void customerInfo() {
        System.out.println(this);
    }
}
