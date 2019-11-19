package com.shengsiyuan.jdk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");
    //    String[] strings = stream.toArray(length -> new String[length]);
//        String[] strings = stream.toArray(String[]::new);
//        Arrays.asList(strings).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
        //List<String> list = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
        List<String> list = stream.collect(() -> new ArrayList(),
                (theList,item) -> theList.add(item),
                (resultList,theList1) -> resultList.addAll(theList1));
        list.forEach(System.out::println);
    }
}
