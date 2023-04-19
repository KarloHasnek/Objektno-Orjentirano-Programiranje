package zadatak1zadatak2;

public class AUXCLS2 {
    
    public static void main(String[] args) {
        double nn = potNKIter(10, -2);
        System.out.println(nn);
        double nnn = potNK(10, -7);
        System.out.println(nnn);
    }

    public static double potNKIter(int n, int k){
        double pot = 1;

        for (int i = 1; i <= Math.abs(k); i++) {
            pot /= n;
        }

        return pot;
    }

    public static double potNK(int n, int k) {
        //samo za n > 0
        if (k == 0) {
            return 1;
        } else {
            return 1/(n/potNK(n, k+1));
        }
    }
}
