package com.shengsiyuan.jdk.funtion;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("张三",20);
		Person person2 = new Person("李四",30);
		Person person3 = new Person("王五",40);
		List<Person> personList = Arrays.asList(person1, person2, person3);

		List<Person> list = findPersonByUsername("张三", personList);
		list.forEach(person -> System.out.println(person.getUsername()));
		System.out.println("--------------------------");

		List<Person> personByAge = findPersonByAge(20, personList);
		personByAge.forEach(person -> System.out.println(person.getAge()));
		System.out.println("---------------------------");

		List<Person> list2 = findPersonByAge2(40, personList,
				(age, list1) -> list1.stream().filter(person -> person.getAge() < age).collect(Collectors.toList()));
		list2.forEach(person -> System.out.println(person.getAge()));
	}

	private static List<Person> findPersonByUsername(String username,List<Person> personList){
		return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
	}

	private static List<Person> findPersonByAge(int age,List<Person> list){
		BiFunction<Integer,List<Person>,List<Person>> biFunction =
				(personAge,personList) -> personList.stream().filter(person -> person.getAge()>age).collect(Collectors.toList());
		return biFunction.apply(age,list);
	}

	private static List<Person> findPersonByAge2(int age,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> function){
		return function.apply(age,personList);
	}
}
