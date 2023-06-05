package pckg_exceptions;

public abstract class Robot {

    protected String name;
    protected int id;
    private static int cntID = 10;

    protected Robot(String name){
        this.name = name;
        this.id = cntID++;
    }

    protected abstract void performSomeAction();

    public void moveToAnotherLocation(){
        System.out.println(getClass().getSimpleName() + " moving to another location!");
    }
}
