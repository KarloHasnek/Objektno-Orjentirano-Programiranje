package zadatak3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Package {
    
    private int id;
    private static int cntID = 100;
    private String destination;
    private Customer customer;
    private float packagePrice;
    private int totalNumber;
    private String webShop;
    private List<Item> items;
    private static final float MINY = 10;
    private static final float MAXY = 100;
    private static final int PCS = 10;
    private Scanner sc;
    private String[] typeItems = {"T-Shirts", "Sneakers"};
    private Set<Payment> paymentMethods;

    public Package(String shop, String destination, Customer customer, Payment paymentMethod){
        this.id = cntID++;
        this.items = new ArrayList<>();
        this.paymentMethods = new HashSet<>();
        this.webShop = shop;
        this.destination = destination;
        this.customer = customer;
        this.paymentMethods.add(paymentMethod);
    }

    public void setScanner(Scanner scanner){
        this.sc = scanner;
    }

    public boolean checkPayment(){
        System.out.println("Enter payment method...");
        boolean status = false;
        String paymentMethod = sc.nextLine();
        for (Payment payment : paymentMethods) {
            if (payment.getPaymentMethod().equals(paymentMethod)) {
                status = true;
                break;
            }
        }
        return status;
    }

    private float randPrice(){
        return ThreadLocalRandom.current().nextFloat(MINY, MAXY);
    }

    private int randPcs(){
        return ThreadLocalRandom.current().nextInt(PCS);
    }

    public void putContent(){
        int numItems = randPcs();
        int[] indx = new int[numItems];

        System.out.println("Adding content to package...");
        for (int i = 0; i < numItems; i++) {
            indx[i] = ThreadLocalRandom.current().nextInt(typeItems.length);
        }

        for (int i = 0; i < numItems; i++) {
            if (indx[i] == 0) {
                T_Shirt tShirt = new T_Shirt(randPrice(), randPcs());
                items.add(tShirt);
            } else {
                Sneakers sneakers = new Sneakers(randPrice(), randPcs());
                items.add(sneakers);
            }
        }
        System.out.println("Package filled.");
        calculateTotalPackagePrice();
        this.totalNumber = getTotalNumber();
    }

    public void calculateTotalPackagePrice(){
        for (Item item : items) {
            packagePrice += item.itemPrice();
        }
    }

    public int getTotalNumber(){
        return items.size();
    }

    

    @Override
    public String toString() {
        return "Package [\nid=" + id + "\ndestination=" + destination + "\ncustomer=" + customer + "\npackagePrice="
                + packagePrice + "\ntotalNumber=" + totalNumber + "\nwebShop=" + webShop + "\nitems=" + items + "\n]";
    }

    public void packageInfo(){
        System.out.println(this);
    }


    private class T_Shirt extends Item{

        protected T_Shirt(float price, int pcs) {
            super(price, pcs);
        }

        float tShirtPrice;
        int tShirtPcs;
        
        @Override
        protected float getPrice() {
            return tShirtPrice;
        }
        
        @Override
        protected int getPcs() {
            return tShirtPcs;
        }
        
        @Override
        protected float itemPrice() {
            return this.tShirtPrice*this.tShirtPcs;
        }
        
    }

    private class Pants extends Item{

        protected Pants(float price, int pcs) {
            super(price, pcs);
        }

        float pantsPrice;
        int pantsPcs;
        
        @Override
        protected float getPrice() {
            return pantsPrice;
        }
        
        @Override
        protected int getPcs() {
            return pantsPcs;
        }
        
        @Override
        protected float itemPrice() {
            return this.pantsPrice*this.pantsPcs;
        }
        
    }

    private class Helmet extends Item{

        protected Helmet(float price, int pcs) {
            super(price, pcs);
        }

        float helmetPrice;
        int helmetPcs;
        
        @Override
        protected float getPrice() {
            return helmetPrice;
        }
        
        @Override
        protected int getPcs() {
            return helmetPcs;
        }
        
        @Override
        protected float itemPrice() {
            return this.helmetPrice*this.helmetPcs;
        }
        
    }

    private class Sneakers extends Item{

        protected Sneakers(float price, int pcs) {
            super(price, pcs);
        }

        float sneakersPrice;
        int sneakersPcs;
        
        @Override
        protected float getPrice() {
            return sneakersPrice;
        }
        
        @Override
        protected int getPcs() {
            return sneakersPcs;
        }
        
        @Override
        protected float itemPrice() {
            return this.sneakersPrice*this.sneakersPcs;
        }
        
    }

}

