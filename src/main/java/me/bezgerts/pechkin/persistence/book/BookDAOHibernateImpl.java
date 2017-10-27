package me.bezgerts.pechkin.persistence.book;

import me.bezgerts.pechkin.domain.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOHibernateImpl implements BookDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public BookDAOHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addBook(Book book) {
        currentSession().save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return currentSession().get(Book.class, id);
    }

    @Override
    public void saveBook(Book book) {
        currentSession().update(book);
    }
}
