package zadatak2;

import java.util.UUID;

public class Person implements CommonAction{

    private String name;
    private int age;
    private int id;
    private static int cntID;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.id = cntID++;
    }

    @Override
    public void walk(String direction, int distance) {
        System.out.println("I'm a human, and you can't command to me!");
    }

    @Override
    public void talk(String sentence) {
        System.out.println("You want me to talk - ok: ");
        System.out.println(UUID.randomUUID().toString());
    }

    @Override
    public void think(String thoughts) {
        System.out.println("Surely, humans are more capable of thinking then robots - aren't they?");

    }

    @Override
    public int calculate(int num) {
        return num%2;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
    }
    
    public void personInfo(){
        System.out.println(this);
    }
}
