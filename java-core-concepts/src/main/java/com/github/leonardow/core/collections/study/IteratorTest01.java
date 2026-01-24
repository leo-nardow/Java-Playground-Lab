package com.github.leonardow.core.collections.study;



import com.github.leonardow.core.collections.domain.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new Book(5L, "Hellsing Ultimate", 19.9,0));
        books.add(new Book(1L, "Berserk", 9.5,5));
        books.add(new Book(4L, "Pokemon", 3.2,0));
        books.add(new Book(3L, "Attack on titan", 11.20,2));
        books.add(new Book(2L, "Dragon ball Z", 2.99,0));

//        Iterator<Book> bookIterator = books.iterator();
//        while(mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0){
//                bookIterator.remove();
//            }
//        }

        books.removeIf(book -> book.getQuantidade() == 0);

        System.out.println(books);
    }
}
