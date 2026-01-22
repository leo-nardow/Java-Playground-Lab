package com.github.leonardow.core.utils.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeStudy {
    public static void main(String[] args) {
        String diretorioProjeto = "home/leonardow/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./leonardow/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
