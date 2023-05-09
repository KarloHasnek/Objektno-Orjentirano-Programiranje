package zadatak2;

public class Robot implements CommonAction{

    private String name;
    private int id;
    private static int cntID;

    public Robot(String name){
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public void walk(String direction, int distance) {
        System.out.println("BEEP-BOOP\nGoing " + direction + " for "+ distance + " meters");
    }

    @Override
    public void talk(String sentence) {
        System.out.println("This robot can't speak!");
    }

    @Override
    public void think(String thoughts) {
        System.out.println("Thinking about " + thoughts);
        System.out.println("Thinking...");
    }

    @Override
    public int calculate(int num) {
        if (num >= 1){
            return num * calculate(num - 1);
        } else return 1;
    }

    @Override
    public String toString() {
        return "Robot [name=" + name + ", id=" + id + "]";
    }

    public void robotInfo(){
        System.out.println(this);
    }
}
