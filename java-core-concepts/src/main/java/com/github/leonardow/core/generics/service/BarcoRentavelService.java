package com.github.leonardow.core.generics.service;

import com.github.leonardow.core.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Boat> barcosDisponiveis = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));

    public Boat buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel....");
        Boat barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Boat barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
