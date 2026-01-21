package com.github.leonardow.core.exceptions;

import com.github.leonardow.core.exceptions.domain.Reader1;
import com.github.leonardow.core.exceptions.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile2() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile3() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("texte.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
