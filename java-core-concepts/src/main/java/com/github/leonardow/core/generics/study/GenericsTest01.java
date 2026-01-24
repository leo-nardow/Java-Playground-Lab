package com.github.leonardow.core.generics.study;

import com.github.leonardow.core.collections.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");


        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Client("Midoriya"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }

    private static void add(List lista, Client consumidor) {
        lista.add(consumidor);
    }
}
