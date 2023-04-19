package pckg_02;

public class Calc {

    public void djeljenje(float a, float b){
    
        if(b != 0){    
            float rez = a / b;
            System.out.println("Rezultat djeljenja iznosi: " + rez);
        } else {
            System.out.println("Djeljenje sa 0 nije moguce.");
        }
    }

    public float circle(float r){

        float pi = 3.14f;
        float povrsina = 0.0f;
        
        if (r <= 0.0f) {
            System.out.println("radijus mora biti veci od 0.");
        } else {

            povrsina = (float) (r*r*pi);
        }
        
        return povrsina;
    }
}
    
