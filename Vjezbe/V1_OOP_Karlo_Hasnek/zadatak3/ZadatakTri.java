package zadatak3;

public class ZadatakTri {
    
    public static void ifThen(int a) {

        if (a < 10) {
            a += 5;
        }
        System.out.println(a);
    }

    public static void ifElse(int a) {

        if (a < 10) {
            
            a += 5;

        } else a -= 5;
        System.out.println(a);
    }

    public static void ifElif(int a) {

        if (a < 10) {
            
            a += 5;

        } else if (a == 10) {
            
            a -= 2;

        } else {
            
            a -= 5;
        }
        System.out.println(a);
    }
}
