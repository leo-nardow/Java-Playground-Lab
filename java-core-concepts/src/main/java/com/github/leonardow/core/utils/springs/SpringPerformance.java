package com.github.leonardow.core.utils.springs;

public class SpringPerformance {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time spent for String " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent for StringBuilder " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent for StringBuffer " + (end - begin) + "ms");
    }


    private static void concatString(int size) {
        String texto = "Hello my name is Leo";
        for (int i = 0; i < size; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
