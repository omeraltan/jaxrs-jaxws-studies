package com.omer.functional;

import java.util.List;

public class Test_02_Structure {

    public static void main(String[] args) {

        //printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));

    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);
    }

}
