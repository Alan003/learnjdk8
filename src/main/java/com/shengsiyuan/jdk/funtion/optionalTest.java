package com.shengsiyuan.jdk.funtion;

import java.util.Optional;

public class optionalTest {
	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("hello");

		optional.ifPresent((o) ->System.out.println(o));

		System.out.println(optional.orElse("world"));

		System.out.println(optional.orElseGet(() -> "111111"));
	}
}
