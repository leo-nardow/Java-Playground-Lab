package com.github.leonardow.core.utils.serialization.domain;

import java.io.*;

public class Aluno implements Serializable {

    private static final long serialVersionUID = 739959230178355186L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NAME_SCHOOL = "Harvard";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        System.out.println("Inside of the construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NAME_SCHOOL='" + NAME_SCHOOL + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
