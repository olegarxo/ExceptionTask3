package ru.gb.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String asd = "963406**3604+dgss++";
        String as = "12345";
        String b  = "-12345";
        System.out.println(b.matches("-?\\d+"));
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(asd);
        while (matcher.find()) {
            System.out.print(matcher.group().toString());
        }
        boolean flag = true;
//        while (flag){
//            System.out.println();
//        }
    }
}