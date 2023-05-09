package zadatak3;

public class Author {
    
    private int id;
    private static int cnt = 10;
    private String name;

    public Author(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + "]";
    }
}
