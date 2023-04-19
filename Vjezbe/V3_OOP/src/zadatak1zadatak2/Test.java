package zadatak1zadatak2;

import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {

        //Robot
        Robot prviRobot = new Robot();
        prviRobot.setID(1);
        prviRobot.setName("Mr. Roboto");
        prviRobot.walk();

        prviRobot.factJel(5);

        //Rekurzija
        int res = AUXCLS.sumNInt(4);
        System.out.println("Rezultat sume pomocu rekurzije iznosi: ");
        System.out.println(res);

        long res2 = AUXCLS.potNK(10, 3);
        System.out.println("Potencija broja n na k iznosi: " + res2);

        //Zadatak 2
        int[][] noviNiz = prviRobot.fillArr(6);
        noviNiz = prviRobot.fillArr(3);
        System.out.println(Arrays.deepToString(noviNiz));
    }
}
