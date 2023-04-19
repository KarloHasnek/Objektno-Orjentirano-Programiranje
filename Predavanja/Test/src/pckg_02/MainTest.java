package pckg_02;

// Ovo je komentar
/* Ovo je block koment */
/** Ovo je sluzbena dokumentacija **/

public class MainTest {
    public static void main(String[] args) {
        
        Calc calc1 = new Calc();
        calc1.djeljenje(10, 0);
        float area = calc1.circle(12);
        System.out.println(area);
    }
}
