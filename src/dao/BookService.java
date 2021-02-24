package dao;

public class BookService {

    BookDao bookDao = new BookDaoImpl();

    public void getAllBooks() {
        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn() + " :: Book Name : " + book.getBookName());
        }
    }

    public void updateBook() {
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        System.out.println("Books after update:");
        getAllBooks();
    }

    public void addBook() {
        Books book = new Books(4,"Go");
        bookDao.saveBook(book);
        System.out.println("Books after new addition:");
        getAllBooks();
    }
}
