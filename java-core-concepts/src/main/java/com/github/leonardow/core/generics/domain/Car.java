package com.github.leonardow.core.generics.domain;

public class Car {
    private String nome;

    public Car(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
