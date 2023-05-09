package zadatak3;

import java.util.ArrayList;

public class Books {
    
    private ArrayList<Book> books;

    public Books(){
        this.books = new ArrayList<Book>();
    }

    public void addNewBook(Book book){
        books.add(book);
        System.out.println("Book added to library of books");
    }

    public void listAllBooks(){
        for (Book book : books) {
            System.out.println(book);
            book.toString();
        }
    }
}
