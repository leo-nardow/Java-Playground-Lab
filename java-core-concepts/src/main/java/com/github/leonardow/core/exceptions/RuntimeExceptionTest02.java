package com.github.leonardow.core.exceptions;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        openConection();
    }

    private static String openConection() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static void openConection2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}
