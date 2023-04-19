package pckg_inner;

public class TestSound {
    
    public static void main(String[] args) {
        SimpleInterface sound = new SimpleInterface() {
            @Override
            public void produceSomeSound() {
                System.out.println("The sound is produced...");
            }
        };
        sound.produceSomeSound();
    }
}
