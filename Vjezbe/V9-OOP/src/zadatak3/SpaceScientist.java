package zadatak3;

import java.io.Serializable;
import java.util.ArrayList;

public class SpaceScientist implements Serializable {


    private String name;
    private int id;
    private static int cntID = 1;
    private String specialization;
    private ArrayList<String> equipment;


    public SpaceScientist(String name) {
        this.name = name;
    }

    public SpaceScientist(String name, String specialization, ArrayList<String> equipment) {
        this.name = name;
        this.id = cntID++;
        this.specialization = specialization;
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "SpaceScientist{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", specialization='" + specialization + '\'' +
                ", equipment=" + equipment +
                '}';
    }
}
