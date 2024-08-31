package com.omer.functional;

import java.util.List;

public class Test_01_Structure {

    public static void main(String[] args) {

        //printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        printEvenNumbersInListStructured(numbers);

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
