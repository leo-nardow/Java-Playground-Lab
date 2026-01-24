package com.github.leonardow.core.collections.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(6);
        books.add("Hellsing Ultimate");
        books.add("Berserk");
        books.add("Pokemon");
        books.add("Attack on titan");
        books.add("Dragon ball Z");

        Collections.sort(books);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);



        for(String book : books){
            System.out.println(book);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
