package com.github.leonardow.core.collections.study;


import com.github.leonardow.core.collections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        com.github.leonardow.core.collections.domain.Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");
        System.out.println(s1.equals(s2));
    }
}
