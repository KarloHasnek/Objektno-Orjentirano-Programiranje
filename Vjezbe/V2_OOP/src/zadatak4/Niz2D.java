package zadatak4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Niz2D {
    
/**
 * Primjer 2D niza
 * @author ante
 * @version 1.1
 * @since 03/2018
 */

	public static void main(String[] args) {
		// deklariranje i inicijalizacija 2D niza
		double[][] vars = new double[3][5];
		int nrows = vars.length;
		int nclmns = vars[0].length;
		double min = 500.45;
		double max = 12578.32;

		// popunjavanje vrijednosti 2D niza
		for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < nclmns; j++) {

                // Generiranje slučajne vrijednosti između zadanih granica
                vars[i][j] = ThreadLocalRandom.current().nextDouble(min, max);
            }
        }

		// For each petlja
		// for(double[] rw : vars) {
		// 	System.out.println(Arrays.toString(rw));
		// }
        
        //Rjesenje zadanog zadatka
        for (int i = 0; i < vars.length; i++) {
            System.out.println(Arrays.toString(vars[i]));
        }


        //Rjesenje uz pomoc deepToString metode
        System.out.println(Arrays.deepToString(vars));
	}
}
