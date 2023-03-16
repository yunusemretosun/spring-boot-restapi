package com.devtiro.books;
import org.springframework.stereotype.Component;
import com.devtiro.books.domain.Book;
import com.devtiro.books.services.BookService;

@Component
public class BookInitializer {
    
    private final BookService bookService;
    
    public BookInitializer(BookService bookService) {
        this.bookService = bookService;
    }
    
    public void initialize() {
        Book test = new Book("01","ahmet","mehmet");
        Book test1 = new Book("02","ahmet","mehmet");
        Book test2 = new Book("03","ahmet","mehmet");
        bookService.save(test);
        bookService.save(test1);
        bookService.save(test2);
    }
}