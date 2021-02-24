package dao;

public class DaoPatternDemo {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.getAllBooks();
        bookService.updateBook();
        bookService.addBook();
    }
}
