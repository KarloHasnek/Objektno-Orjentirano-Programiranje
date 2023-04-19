package pckg_03;

import java.util.Arrays;

import pckg_01.User;

public class NizoviTest {
    
     public static void main(String[] args) {
        
        int[] niz1 = new int[5];
        float[] niz2 = new float[5];
        User[] users = new User[3];
        System.out.println(niz1);
        printElements(niz1);
        printElements(niz2);
        System.out.println(Arrays.toString(users));
        users[1] = new User("Name1", "Simple desc...");
        System.out.println(Arrays.toString(users));
        users[0] = new User();
     }


     private static void printElements(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Element: " + ar[i]);
        }
    }

     private static void printElements(float[] flAr) {
        for (int i = 0; i < flAr.length; i++) {
            System.out.println("Element: " + flAr[i]);
        }
     }

}
