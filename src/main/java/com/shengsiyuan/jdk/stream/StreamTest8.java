package com.shengsiyuan.jdk.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");
        //Collections.sort(list);

        //Collections.sort(list,(str1,str2)->str1.length()-str2.length());
        //Collections.sort(list,(str1,str2)->str2.length()-str1.length());
        //list.sort(Comparator.comparingInt(str -> str.length()));

        //list.sort(Comparator.comparingInt((String str) -> str.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length));
//        Collections.sort(list,Comparator.comparingInt(String::length));
        //Collections.sort(list,Comparator.comparingInt(String::length).reversed());
        Collections.sort(list,Comparator.comparingInt((String str) -> str.length()));
        System.out.println(list);
    }
}
