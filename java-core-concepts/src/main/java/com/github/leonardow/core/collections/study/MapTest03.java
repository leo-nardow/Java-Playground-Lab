package com.github.leonardow.core.collections.study;

import com.github.leonardow.core.collections.domain.Book;
import com.github.leonardow.core.collections.domain.Client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Client client1 = new Client("Leonardo Almeida");
        Client client2 = new Client("Fernando Carmo");

        Book book1 = new Book(5L, "Hellsing Ultimate", 19.9);
        Book book2 = new Book(1L, "Berserk", 9.5);
        Book book3 = new Book(4L, "Pokemon", 3.2);
        Book book4 = new Book(3L, "Attack on titan", 11.20);
        Book book5 = new Book(2L, "Dragon ball Z", 2.99);

        List<Book> bookClient1List = List.of(book1, book2, book3);
        List<Book> bookClient2List = List.of(book3, book4);
        Map<Client, List<Book>> clientListMapMap = new HashMap<>();
        clientListMapMap.put(client1, bookClient1List);
        clientListMapMap.put(client2, bookClient2List);

        for(Map.Entry<Client, List<Book>> entry : clientListMapMap.entrySet()){
            System.out.println("----"+entry.getKey().getNome());
            for (Book book : entry.getValue()) {
                System.out.println("-------"+book.getNome());
            }

        }


    }
}
