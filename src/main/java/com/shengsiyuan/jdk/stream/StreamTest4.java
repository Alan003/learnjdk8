package com.shengsiyuan.jdk.stream;

import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {

        /**
         * stream 流没有遇到终止操作都是惰性求值，forEach就是一个终止操作，没有终止操作什么都不打印
         */
//        Stream<Integer> stream = Stream.iterate(0, item -> item + 2).limit(6);
//        stream.map(i -> {
//            int result= i * 2;
//            System.out.println("test");
//            return result;
//        });

        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
        stream1.map(str -> {
            String result = str.substring(0,1).toUpperCase()+str.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);


    }
}
