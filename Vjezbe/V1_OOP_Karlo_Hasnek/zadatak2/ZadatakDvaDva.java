package zadatak2;


public class ZadatakDvaDva {
    
    public static void perSum() {
        int a = 5;
        int b = 2;
        int c = a + b;

        System.out.println("Result of sum is: " + c);
    }
    
    public static void perSub() {
        int a = 5;
        int b = 2;
        int c = a - b;

        System.out.println("Result of substraction is: " + c);
    }

    public static void perMult() {
        int a = 5;
        int b = 2;
        int c = a * b;

        System.out.println("Result of multiplication is: " + c);
    }

    public static void perDiv() {
        int a = 6;
        int b = 2;
        int c = a / b;

        System.out.println("Result of division is: " + c);
    }
    
    public static void perMod() {
        int a = 6;
        int b = 2;
        int c = a % b;

        System.out.println("Result of mod is: " + c);
    }

    public static void perSqrt() {
        float a = 2;
        float c = (float) Math.sqrt(a);

        System.out.println("Result of square root is: " + c);
    }

    public static void perAbs() {
        float a = -6.5f;
        float c = Math.abs(a);


        System.out.println("Absolute of result is: " + c);
    }
}
