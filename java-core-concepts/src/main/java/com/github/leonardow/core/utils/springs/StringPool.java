package com.github.leonardow.core.utils.springs;

public class StringPool {
    public static void main(String[] args) {
        String name = "Leonardo"; //String constant pool
        String name2 = "Leonardo";
        name = name.concat(" Almeida"); // name += " Almeida"
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Leonardo"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
