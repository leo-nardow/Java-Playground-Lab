package com.github.leonardow.core.exceptions;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        division(1,0);
    }

    private static int division(int a, int b) throws IllegalArgumentException {
        if (b==0) {
            throw new IllegalArgumentException("Ilegal argument, cannot be zero");
        }
        try {
            return a/b;
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Here is also executed");
        return 0;
    }
}
