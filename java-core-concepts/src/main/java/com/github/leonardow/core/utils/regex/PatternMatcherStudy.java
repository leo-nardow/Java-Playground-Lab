package com.github.leonardow.core.utils.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherStudy {
    public static void main(String[] args) {
        String regex = "aba";
//        String text = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  "+ text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Position founded");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
