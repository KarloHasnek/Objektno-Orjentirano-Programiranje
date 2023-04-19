package pckg_interfaces;

public class TestSuperHeroes {
    
    public static void main(String[] args) {
        SpiderMan sp = new SpiderMan("Peter", "PhotoReporter", 21);
        Superman sm = new Superman("Clark", "Reporter", 33);
        sp.flyAbility();
        sm.flyAbility();
        sp.runningAbility();
        sm.runningAbility();
        sm.enableSuperVision();
    }
}
