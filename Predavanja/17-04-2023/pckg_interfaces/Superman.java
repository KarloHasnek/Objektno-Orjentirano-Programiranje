package pckg_interfaces;

public class Superman extends Person implements Fly, Run, SuperVision {

    private boolean mood;

    protected Superman(String name, String occ, int age) {
        super(name, occ, age);
        this.mood = false;
    }

    public void enableSuperVision() {
        if (!mood) {
            System.out.println("supervision is on...");
        } else {
            System.out.println("Leave me alone...");
        }
    }

    @Override
    public void runningAbility() {
        System.out.println("Almost fast as Flash...");

    }

    @Override
    public void flyAbility() {
        System.out.println("Can fly better than birds...");

    }

    @Override
    protected void provideExplanation() {
        System.out.println("Where are my glasses...");
    }
    
}
