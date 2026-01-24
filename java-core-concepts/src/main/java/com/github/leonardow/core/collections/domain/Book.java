package com.github.leonardow.core.collections.domain;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Book(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Book(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book manga = (Book) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Book otherBook) {
        // negativo se o this < otherBook
        // se this == otherBook, return 0
        // positivo se this > otherBook
//        if(this.id < otherBook.getId()){
//            return -1;
//        }else if(this.id.equals(otherBook.getId())){
//            return 0;
//        }else {
//            return 1;
//        }
        return this.nome.compareTo(otherBook.getNome());
//        return Double.compare(preco, otherBook.getPreco());
//        return Double.valueOf(preco).compareTo(otherBook.getPreco());
//        return this.id.compareTo(otherBook.getId());
    }
}
