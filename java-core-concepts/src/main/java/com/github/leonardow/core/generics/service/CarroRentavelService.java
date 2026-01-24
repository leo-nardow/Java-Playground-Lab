package com.github.leonardow.core.generics.service;



import com.github.leonardow.core.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Car> carrosDisponiveis = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car buscarCarroDisponivel() {
        System.out.println("Buscando carro disponivel....");
        Car carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Car carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
