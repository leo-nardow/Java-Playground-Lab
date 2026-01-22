package com.github.leonardow.core.utils.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterStudy {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)) {
          fw.write("Hello, World!\nNextLine\n");
          fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
