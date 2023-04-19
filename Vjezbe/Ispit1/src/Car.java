public class Car extends Vehicle {

    private String model;


    Car(String model){
        this.model = model;
        this.id = cnt++;
    }

    
    @Override
    public void move(String s, double n) {
        super.move(s, n);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + "id=" + id +"]";
    }
}
