package com.shengsiyuan.jdk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest6 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 21);
        Student student3 = new Student("wangwu", 100, 20);
        Student student4 = new Student("zhangsan", 90, 20);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);
        Map<String, List<Student>> nameMap = list.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(nameMap);

        Map<Integer, List<Student>> scoreMap = list.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(scoreMap);

        Map<String, Long> sizeMap = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(sizeMap);

        Map<String, Double> averageScoreMap = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(averageScoreMap);

        Map<Boolean, List<Student>> booleanListMap = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 90));
        System.out.println(booleanListMap);
    }
}
