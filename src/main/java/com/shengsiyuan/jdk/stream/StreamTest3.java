package com.shengsiyuan.jdk.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

//        stream.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
//        stream.map(String::toUpperCase).forEach(System.out::println);
//        Stream.of(1,2,3,4,5,6).map(item -> item * item).forEach(System.out::println);
        //Stream.of(Arrays.asList(1,2),Arrays.asList(3,4,5),Arrays.asList(6,7))
          //      .flatMap(theList -> theList.stream()).forEach(System.out::println);

//        System.out.println( stream.collect(Collectors.joining()).toString());

//        Stream<String> stream1 = Stream.generate(UUID.randomUUID()::toString);
//        stream1.findFirst().ifPresent(System.out::println);

        //创建一个无限流，seed:起始值，UnaryOperator:对前一个值按照给定的逻辑进行操作后返回一个值
        //Stream.iterate(1,item -> item+1).limit(6).forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(1,3,5,7,9,11);
//        Integer total = stream1.filter(i -> i > 2).map(item -> item * 2).skip(2).limit(2).reduce(0, (a,b) -> a+b);
        Integer total = stream1.filter(i -> i > 2).map(item -> item * 2).skip(2).limit(2).reduce(0, Integer::sum);
        System.out.println(total);
    }
}
