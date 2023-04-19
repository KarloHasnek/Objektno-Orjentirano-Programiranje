package pckg_inner;

public class Test {
    
    public static void main(String[] args) {
        
        OUTER ot = new OUTER("Simple outer cls...");
        ot.outerInfo();
        OUTER.INNER inr1 = ot.new INNER();
        inr1.innerInfo();
        OUTER.INNER inr2 = ot.createInnerObj();
        inr2.innerInfo();
        OUTER.InnerOnArrays.addElementToArray(100);
        OUTER.InnerOnArrays.addElementToArray(1000);
    }
}
