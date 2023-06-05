package pckg_exceptions;

public class HomeAssistantRobot extends Robot{

    protected HomeAssistantRobot(String name) {
        super(name);
    }

    @Override
    protected void performSomeAction() {
        System.out.println(getClass().getSimpleName() + " perform some home assistance...");
    }
}
