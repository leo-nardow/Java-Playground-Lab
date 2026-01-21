package com.github.leonardow.core.exceptions;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    private static void createNewFile() throws IOException {
        File file = new File("java-core-concepts/src/main/resources\\test.txt");

        try{
            boolean isCreated = file.createNewFile();
            System.out.println("File created "+ isCreated);
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
