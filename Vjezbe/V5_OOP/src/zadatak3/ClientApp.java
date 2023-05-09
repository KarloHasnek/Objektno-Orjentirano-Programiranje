package zadatak3;

import java.util.Scanner;

public class ClientApp {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Ante");
        System.out.println(customer);

        Payment payment1 = new Payment("Card 100");
        System.out.println(payment1);

        Package package1 = new Package("SHOP", "destinacija-01", customer, payment1);
        package1.putContent();
        package1.packageInfo();
    }
}
