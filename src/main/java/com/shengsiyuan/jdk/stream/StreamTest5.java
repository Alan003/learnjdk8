package com.shengsiyuan.jdk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello world",
//                "hello welcome", "hello world hello", "hello world hello");
//        stream.flatMap(item -> Arrays.stream(item.split(" "))).distinct().forEach(System.out::println);


//        Stream<String> stream1 = Stream.of("Hi", "Hello", "您好");
//        Stream<String> stream2 = Stream.of("zhangsan", "lisi", "wangwu", "zhaoliu");

//      这里流已经被消费，流是不能重复消费或者操作的，会抛异常
//        List<String> list = stream1.flatMap(item -> stream2.map(item2 -> item + " " + item2)).collect(Collectors.toList());
//        list.stream().forEach(System.out::println);

        List<String> list1 = Arrays.asList("Hi", "Hello", "您好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        list1.stream().flatMap(item ->list2.stream().map(item2 -> item+ " "+item2)).collect(Collectors.toList()).forEach(System.out::println);

        //每次都会拿到一个新的stream对象
       Stream<String> stream = list2.stream();
       Stream<String> stream1 = list2.stream();
       System.out.println(stream==stream1);
    }
}
