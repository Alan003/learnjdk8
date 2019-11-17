package com.shengsiyuan.jdk.funtion;

import java.util.function.Function;

public class FuntionTest {
	public static void main(String[] args) {
		FuntionTest test = new FuntionTest();
//		System.out.println(test.compute(2,vaule -> vaule * vaule));
//		System.out.println(test.compute(3,value -> value + 2));

		System.out.println(test.compute2(3,value -> value + 3,value -> value * value));
		System.out.println(test.compute3(3,value -> value + 3,value -> value * value));
	}

	public int compute(int a, Function<Integer,Integer> function){
		return function.apply(a);
	}

	public int compute2(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
		return function1.compose(function2).apply(a);
	}

	public int compute3(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
		return function1.andThen(function2).apply(a);
	}
}
