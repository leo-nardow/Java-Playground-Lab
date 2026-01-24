package com.github.leonardow.core.collections.study;



import com.github.leonardow.core.collections.domain.Book;
import com.github.leonardow.core.collections.domain.Client;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Client client1 = new Client("Leonardo Almeida");
        Client client2 = new Client("Fernando Carmo");

        Book book1 = new Book(5L, "Hellsing Ultimate", 19.9);
        Book book2 = new Book(1L, "Berserk", 9.5);
        Book book3 = new Book(4L, "Pokemon", 3.2);
        Book book4 = new Book(3L, "Attack on titan", 11.20);
        Book book5 = new Book(2L, "Dragon ball Z", 2.99);

        Map<Client, Book> clientBookMap = new HashMap<>();
        clientBookMap.put(client1, book1);
        clientBookMap.put(client2, book4);
        for (Map.Entry<Client, Book> entry : clientBookMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
