package me.bezgerts.pechkin.persistence.book;

import me.bezgerts.pechkin.domain.Book;

public interface BookDAO {
    void addBook(Book book);
    Book getBookById(Long id);
    void saveBook(Book book);
}
