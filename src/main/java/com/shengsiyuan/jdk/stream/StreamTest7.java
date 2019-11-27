package com.shengsiyuan.jdk.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest7 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 21);
        Student student3 = new Student("wangwu", 80, 20);
        Student student4 = new Student("zhangsan", 90, 21);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        Map<String, List<Student>> map1 = list.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map1);

        list.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        Double average = list.stream().collect(Collectors.averagingDouble(Student::getScore));
        System.out.println(average);

        int sum = list.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum);

        Integer sum1 = list.stream().collect(Collectors.summingInt(Student::getScore));
        System.out.println(sum1);

        IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println("count"+intSummaryStatistics.getCount()+"--"
                +"average"+intSummaryStatistics.getAverage()+"--"
                +"max"+intSummaryStatistics.getMax()+"--"
                +"min"+intSummaryStatistics.getMin()+"--"
                +"sum"+intSummaryStatistics.getSum());

        String nameStr1 = list.stream().map(Student::getName).collect(Collectors.joining());
        System.out.println(nameStr1);

        String nameStr2 = list.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println(nameStr2);

        String nameStr3 = list.stream().map(Student::getName).collect(Collectors.joining(",", "<begin>", "</end>"));
        System.out.println(nameStr3);

        Map<Integer,Map<String,List<Student>>> map2 = list.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.groupingBy(Student::getName)));
        System.out.println(map2);

        Map<Boolean, List<Student>> map3 = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80));
        System.out.println(map3);

        Map<Boolean, Map<Boolean, List<Student>>> map4 = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.partitioningBy(item -> item.getScore() > 90)));
        System.out.println(map4);

        Map<Boolean, Long> map5 = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.summingLong(Student::getScore)));
        System.out.println(map5);

        Map<String, Student> map6 = list.stream().collect(Collectors.groupingBy(Student::getName,
                Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Student::getScore)), Optional::get))
        );
        System.out.println(map6);
    }
}
