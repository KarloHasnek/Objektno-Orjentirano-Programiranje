package zadatak3;

public abstract class Item {

    protected float itemPrice;
    protected int itemPcs;
    
    abstract float itemPrice();  
    abstract float getPrice();  
    abstract int getPcs();

    protected Item(float price, int pcs){
        this.itemPcs = pcs;
        this.itemPrice = price;
    }
}
