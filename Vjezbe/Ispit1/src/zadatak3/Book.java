package zadatak3;

public class Book {
    
    private int id;
    private static int cnt = 10;
    private String title;

    public Book(String title, Author author) {
        this.title = title;
        this.id = cnt++;

        Author bookAuthor = author;
        System.out.println("Book created.");
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + "]";
    }
}
