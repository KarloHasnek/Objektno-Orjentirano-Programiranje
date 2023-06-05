package zadatak3;

public abstract class Item {

    protected float itemPrice;
    protected int numItems;

    protected Item(float itemPrice, int numItems) {
        this.itemPrice = itemPrice;
        this.numItems = numItems;
    }

    protected float getItemPrice() {
        return itemPrice;
    }

    public int getNumItems() {
        return numItems;
    }

    protected abstract float calculatePrice();

    protected void setVoidPrice(float price) {
        this.itemPrice = price;
    }
}
