package com.omer.functional;

import java.util.List;

public class Test_03_Structure {

    public static void main(String[] args) {

        List<String> courses = List.of("Java", "C#", "Python", "C++", "JavaScript", "Spring", "Spring Boot");

        //printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printOddNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        System.out.println("--------");
        courses.stream().forEach(System.out::println);
        System.out.println("--------");
        courses.stream().filter(course->course.contains("Java")).forEach(System.out::println);
        System.out.println("--------");
        courses.stream().filter(course->course.length() > 4).forEach(System.out::println);
        System.out.println("--------");
        printSquaresOfEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        System.out.println("--------");
        courses.stream().map(numbers -> numbers + " : " + numbers.length()).forEach(System.out::println);


    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printOddNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 != 0)
            .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .map(number -> number * number)
            .forEach(System.out::println);
    }

}
