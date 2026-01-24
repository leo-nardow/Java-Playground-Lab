package com.github.leonardow.core.collections.study;



import com.github.leonardow.core.collections.domain.Book;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Book> books = new LinkedHashSet<>();
        books.add(new Book(5L, "Hellsing Ultimate", 19.9,0));
        books.add(new Book(1L, "Berserk", 9.5,5));
        books.add(new Book(4L, "Pokemon", 3.2,0));
        books.add(new Book(3L, "Attack on titan", 11.20,2));
        books.add(new Book(2L, "Dragon ball Z", 2.99,0));

        for(Book manga: books){
            System.out.println(manga);
        }
    }
}
