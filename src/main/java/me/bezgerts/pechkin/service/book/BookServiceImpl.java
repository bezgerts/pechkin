package me.bezgerts.pechkin.service.book;

import me.bezgerts.pechkin.domain.Book;
import me.bezgerts.pechkin.persistence.GenericDAO;
import me.bezgerts.pechkin.persistence.book.BookDAO;
import me.bezgerts.pechkin.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends GenericServiceImpl<Book, Long> implements BookService {

    private BookDAO bookDAO;

    public BookServiceImpl() {}

    @Autowired
    public BookServiceImpl(@Qualifier(value = "bookDAOHibernateImpl") GenericDAO<Book, Long> genericDAO) {
        super(genericDAO);
        this.bookDAO = (BookDAO) genericDAO;
    }
}
