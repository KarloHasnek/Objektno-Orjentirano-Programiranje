package zadatak5;

public class PrihodRashod {
   
    private static int[] prihodi = {125855, 284569, 324152, 204563, 452198, 471326, 505169, 498569, 367163, 289568, 115255, 98544};
    private static int[] rashodi = {105625, 155748, 198455, 195251, 257654, 322188, 355748, 315782, 389455, 302369, 109854, 85223};
    private static float prosjecniProfit = 0.0f;
    static int brojac = 1;

    public static void ispisProfita(){
        for (int i = 0; i < prihodi.length; i++) {
            int profit = prihodi[i] - rashodi[i];
            prosjecniProfit += profit;
            System.out.println("Profit za " + brojac + " mjesec iznosi: " + profit);
            brojac++;
        }
        prosjecniProfit /= prihodi.length;
        System.out.println("Prosjecni profit tvrtke za promatranu godinu iznosi: " + prosjecniProfit);
    }
}
