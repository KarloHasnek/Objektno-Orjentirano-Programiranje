package pckg_03;

public class AUX01 {

    //private static int idx; //Isti index za sve objekte kreirane!
    public String classSpecName;
    //private static final int PR = 21; //definirana konstanta, nece se mijenjati!

    public AUX01(String name) {
        classSpecName = name;
        //idx = 101;
    }
    
 /*   public static int sumFirstNInt(int n){
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println(sum);

        return sum;
    }
 */

    public static int sumFirstNInt2(int n) {

        int sum = 0;
        int i = 1;

        while(i<=n) {
            sum += i;
            i++;
        }

        return sum;
    }


    public String getClassSpecName() {
        return this.classSpecName;
    }

    public void setClassSpecName(String classSpecName) {
        this.classSpecName = classSpecName;
    }


    @Override
    public String toString() {
        return "{" +
            " classSpecName='" + getClassSpecName() + "'" +
            "}";
    }

}
