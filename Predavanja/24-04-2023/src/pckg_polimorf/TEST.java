package pckg_polimorf;

import java.util.ArrayList;

public class TEST {
    
    public static void main(String[] args) {
        
        SmartTV smart = new SmartTV();
        Device smart2 = new SmartTV();
        smart.powerOnDevice(20);
        smart2.powerOnDevice(35, "Petra");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new RubberAnimal());
        animals.add(new Tiger());
        animals.add(new RubberAnimal());
        producingAnimalSounds(animals);
        
        Tiger tiger = new Tiger();
        tiger.huntPrey();
    }

    private static void producingAnimalSounds(ArrayList<Animal> animals) {

        for (Animal animal : animals) {
            animal.produceSomeSound();
        }
    }
}
