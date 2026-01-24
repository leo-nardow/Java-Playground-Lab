package com.github.leonardow.core.collections.study;



import com.github.leonardow.core.collections.domain.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookByIdComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getId().compareTo(book2.getId());
    }
}

public class BookSortTest01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(6);
        books.add(new Book(5L, "Hellsing Ultimate", 19.9));
        books.add(new Book(1L, "Berserk", 9.5));
        books.add(new Book(4L, "Pokemon", 3.2));
        books.add(new Book(3L, "Attack on titan", 11.20));
        books.add(new Book(2L, "Dragon ball Z", 2.99));
        for (Book book : books) {
            System.out.println(book);
        }
        Collections.sort(books);
        System.out.println("-------------");
        for (Book book : books) {
            System.out.println(book);
        }

//        Collections.sort(books, new BookByIdComparator());
        books.sort(new BookByIdComparator());
        System.out.println("-------------");
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
