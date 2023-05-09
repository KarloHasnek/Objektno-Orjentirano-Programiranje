package zadatak3;

public class Test {
    
    public static void main(String[] args) {
        
        Author author1 = new Author("AUTHOR-01");
        Author author2 = new Author("AUTHOR-01");

        Book book1 = new Book("Book-01", author1);
        Book book2 = new Book("Book-02", author1);
        Book book3 = new Book("Book-03", author2);
        Book book4 = new Book("Book-04", author2);
        Book book5 = new Book("Book-05", author2);

        Books books = new Books();
        books.addNewBook(book1);
        books.addNewBook(book2);
        books.addNewBook(book3);
        books.addNewBook(book4);
        books.addNewBook(book5);

        books.listAllBooks();
    }
}
