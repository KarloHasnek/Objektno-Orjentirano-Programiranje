package pckg_02;

public class Hlace {
    
    //atributi
    private int width;
    private int height;
    private String material;
    private boolean isClear;


    //konstruktori
    public Hlace(String material, boolean isClear) {

        this.material = material;
        this.isClear = isClear;
        System.out.println("Constructor for material and clear or not!");

    }

    public Hlace(int h, int w, String m, boolean isCL) {
        this(m, isCL);
        height = h;
        width = w;
        System.out.println("Constructor and part!");
    }


    //metoda
    public Hlace notClear(boolean isCL) {
        if (!isCL) {
            this.isClear = isCL;

        }
        return this;
    }

    public void clearHlace() {
        if (this.isClear) {
            System.out.println("Hlace su ciste, ne treba pranje.");
        } else {
            System.out.println("Aktiviran proces pranja....");
            operihlace(this);
            System.out.println("Hlace su oprane!");
        }
    }

    private void operihlace(Hlace hlace) {
        System.out.println("Proces pranja hlaca.");
        this.isClear = true;
        System.out.println("Finished!");
    }

    @Override
    public String toString() {
        return "Hlace [width=" + width + ", height=" + height + ", material=" + material + ", hashcode=" + this.hashCode() + ", isClear=" + isClear + "]";
    }
}
