package com.github.leonardow.core.utils.springs;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Leonardo";
        name.concat(" Almeida");
        name.substring(0,3);
        System.out.println(name);
        StringBuffer sb = new StringBuffer("Leonardo Almeida");
        sb.append(" Almeida").append(" do Carmo");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
