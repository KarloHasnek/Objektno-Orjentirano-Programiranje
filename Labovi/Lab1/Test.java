public class Test {

    public static void main(String[] args) {
        // kreirajte jedna objekt s korisničkim imenom Ivana
        CLS_FUND o1 = new CLS_FUND("Ivana");
        
        // kreirajte drugi objekt isto s korisničkim imenom Ivana
        CLS_FUND o2 = new CLS_FUND("Ivana");
        
        // kreirajte novu referencu clsFund3 koja pokazuje na isti objekt kao prva referenca
        CLS_FUND o3 = o1;
        
        // ispis prvog objekta
        System.out.println(o1);
        
        // ispis drugog objekta
        System.out.println(o2);
        
        
        // pozovite metodu na nivou klase da pokaže vrijednost zajedničkog atributa
        CLS_FUND.clsData();
        
        // postavite novo ime prvom objektu na "Ivana-2"
        o1.setName("Ivana-2");
        
        // ispis tog objekta
        System.out.println(o1);
        
       
        // testirajte jesu li objekti 1 i 2 jednaki
        System.out.println("Object are equal or not: " + CLS_FUND.checkEquality(o1, o2));
        // testirajte jesu li objekti na koji pokazuju treća i prva referenca jednaki
        System.out.println("Object are equal or not: " + CLS_FUND.checkEquality(o1, o3));

    }
}


/*
 --- Expected output (text)---

[ CLS_FUND | userName=Ivana, id=100 ]
[ CLS_FUND | userName=Ivana, id=101 ]
Cnt id is: 102
[ CLS_FUND | userName=Ivana-2, id=100 ]
Object are equal or not: false
Object are equal or not: true
 */