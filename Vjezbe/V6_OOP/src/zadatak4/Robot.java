package zadatak4;

public class Robot {

    private int id;
    private String opis;

    public Robot(int id, String opis) {
        this.opis = opis;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Robot -> [" + "id=" + id + " | opis='" + opis + ']';
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
