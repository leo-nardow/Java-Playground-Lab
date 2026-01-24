package com.github.leonardow.core.generics.study;



import com.github.leonardow.core.generics.domain.Boat;
import com.github.leonardow.core.generics.domain.Car;
import com.github.leonardow.core.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Car> carrosDisponiveis = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> barcosDisponiveis = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));
        RentalService<Car> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Car carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------");

        RentalService<Boat> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Boat barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
