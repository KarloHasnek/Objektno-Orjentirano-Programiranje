package zadatak8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class DoubleArrayManipulation {

    private static final double MINDOUBLE = 0.0;
    private static final double MAXDOUBLE = 2000.0;
    

    public static Double[] generateDoubleArr(int numElements) {

        Double[] genArrDouble = new Double[numElements];

        for (int i = 0; i < numElements; i++) {
            Double rndDouble = ThreadLocalRandom.current().nextDouble(MINDOUBLE, MAXDOUBLE);
            genArrDouble[i] = rndDouble;
        }
        System.out.println("Finished!");
        return genArrDouble;
    }

    public static void printAndSort(Double[] dArr) {
        System.out.println("Unsorted: ");
        System.out.println(Arrays.toString(dArr));

        Arrays.sort(dArr); //ascending
        System.out.println("Ovo je niz sortiran uzlazno: ");
        System.out.println(Arrays.toString(dArr));
        //Arrays.sort(dArr, new ComparatorDescendingDouble());
        System.out.println("Ovo je niz sortiran silazno: ");
        //System.out.println(Arrays.toString(dArr));
        Comparator<Double> doubleComparator = Collections.reverseOrder();
        Arrays.sort(dArr, doubleComparator);
        System.out.println(Arrays.toString(dArr));
        
    }

    /*
     private static class ComparatorDescendingDouble implements Comparator<Double> {
         
         @Override
         public int compare(Double o1, Double o2) {
             return o2.compareTo(o1);
            }
            
        }
        */
    }
