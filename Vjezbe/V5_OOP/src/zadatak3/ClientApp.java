package zadatak3;

import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer("Jurica");
        System.out.println(customer);
        Payment payment1 = new Payment("MASTERCARD");
        System.out.println(payment1);

        Package package1 = new Package("eXtremeDigital", "Zadar", customer, payment1);
        package1.packageInfo();
        package1.putContent();
        System.out.println("-----------------------------------------");
        package1.packageInfo();
    }
}