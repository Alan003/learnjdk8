package com.shengsiyuan.jdk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
//		Stream stream = Stream.of("hello","world","hello world");
//		Stream stream1 = Arrays.stream(new String[]{"hello","world","hello world"});
//		stream.forEach(System.out::println);
//		System.out.println("-----------");
//
//		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
//		list.stream().map(i ->2*i).reduce(0,Integer::sum);
//
//		IntStream.of(new int[]{1, 2, 3, 4, 5, 6, 7}).forEach(System.out::println);
//		System.out.println("------------");
//
//		IntStream.range(2,7).forEach(System.out::println);
//		System.out.println("------------");
//
//		IntStream.rangeClosed(2,7).forEach(System.out::println);
		String str = "行[2],列[地市]";
		System.out.println("h(\'div\',\'"+str+"\')");
	}
}
