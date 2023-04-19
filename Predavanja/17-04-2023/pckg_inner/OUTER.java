package pckg_inner;

import java.util.ArrayList;

public class OUTER {
    
    private String desc;
    private static final String OUTER = "OUTER CLASS";
    private static ArrayList<Integer> lst;

    public OUTER(String descString){
        this.desc = desc;
        lst = new ArrayList<>();
    }

    static class InnerOnArrays {

        static void addElementToArray(Integer element){
            lst.add(element);
            System.out.println("Added element to list is -> " + element);
            System.out.println(lst);
        }
    }

    class INNER {

        public INNER(){
            System.out.println("Creating the inner class instance...");
        }

        public void innerInfo(){
            System.out.println(getClass().getSimpleName());
            System.out.println("Outer class -> " + OUTER);
            System.out.println("@" + Integer.toHexString(this.hashCode())); 
        }
    }

    public void outerInfo(){
        System.out.println("Desc: " + desc);
        System.out.println(getClass().getSimpleName());     
    }

    public INNER createInnerObj(){
        return new INNER();
    }
}
