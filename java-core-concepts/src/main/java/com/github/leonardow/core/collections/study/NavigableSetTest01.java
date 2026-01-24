package com.github.leonardow.core.collections.study;



import com.github.leonardow.core.collections.domain.Book;
import com.github.leonardow.core.collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class BookPrecoComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Book> books = new TreeSet<>(new BookPrecoComparator());
        books.add(new Book(5L, "Hellsing Ultimate", 19.9, 0));
        books.add(new Book(1L, "Berserk", 9.5, 5));
        books.add(new Book(4L, "Pokemon", 3.2, 0));
        books.add(new Book(3L, "Attack on titan", 11.20, 2));
        books.add(new Book(2L, "Dragon ball Z", 2.99, 0));
        books.add(new Book(10L, "Aaragon", 2.99, 0));

        for (Book manga : books) {
            System.out.println(manga);
        }

        Book yuyu = new Book(21L, "Yuyu Hakusho", 3.2, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------------");
        System.out.println(books.lower(yuyu));
        System.out.println(books.floor(yuyu));
        System.out.println(books.higher(yuyu));
        System.out.println(books.ceiling(yuyu));

        System.out.println(books.size());
        System.out.println(books.pollLast());
        System.out.println(books.size());

    }
}
