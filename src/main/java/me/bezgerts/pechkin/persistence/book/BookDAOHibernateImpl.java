package me.bezgerts.pechkin.persistence.book;

import me.bezgerts.pechkin.domain.Book;
import me.bezgerts.pechkin.persistence.GenericDaoHibernateImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOHibernateImpl extends GenericDaoHibernateImpl<Book, Long> implements BookDAO {
}
