package pckg_polimorf;

public class Tiger extends Animal {

    @Override
    public void produceSomeSound() {
        System.out.println(getClass().getSimpleName() + " Roar");

    }

    public void huntPrey() {
        System.out.println("tiger is hunting something...");
    }
    
}
