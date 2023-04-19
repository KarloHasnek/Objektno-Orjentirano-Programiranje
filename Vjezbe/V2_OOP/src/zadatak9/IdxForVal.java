package zadatak9;

public class IdxForVal {
    
    public static void main(String[] args) {

        float[] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};
        int cnt = 0;

        for (float f : nums) {
            System.out.println("Index: " + cnt + " <-> Value: " + f);
            cnt++;
        }
    }
}
