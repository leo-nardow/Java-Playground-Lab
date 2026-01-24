package com.github.leonardow.core.collections.study;

import com.github.leonardow.core.collections.domain.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        BookByIdComparator bookByIdComparator = new BookByIdComparator();
        List<Book> books = new ArrayList<>(6);
        books.add(new Book(5L, "Hellsing Ultimate", 19.9));
        books.add(new Book(1L, "Berserk", 9.5));
        books.add(new Book(4L, "Pokemon", 3.2));
        books.add(new Book(3L, "Attack on titan", 11.20));
        books.add(new Book(2L, "Dragon ball Z", 2.99));

//        Collections.sort(books);
        books.sort(bookByIdComparator);
        for (Book book : books) {
            System.out.println(book);
        }

        Book bookToSearch = new Book(2L, "Dragon ball Z", 2.99);

        System.out.println(Collections.binarySearch(books, bookToSearch,bookByIdComparator));

    }
}
