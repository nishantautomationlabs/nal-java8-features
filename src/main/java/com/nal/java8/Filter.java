package com.nal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nishant on 27/12/19.
 */
public class Filter {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1","4","3","6","5","2");
        System.out.println(stringList);
        List<Integer> integerList = testMap(stringList);
        System.out.println(integerList);
        List<Integer> evenIntegers = testFilter(integerList);
        System.out.println(evenIntegers);

        List<Integer> integers = testMapAndFilterWithSorted(stringList);
        System.out.println(integers);
        System.out.println(testCount(stringList));

        testForEach(stringList);

    }

    private static List<Integer> testMap(List<String> stringList) {
        List<Integer> integerList = stringList.stream()
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());
        return integerList;
    }

    private static List<Integer> testFilter(List<Integer> integerList) {
        return integerList.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> testMapAndFilterWithSorted(List<String> stringList) {
        return stringList.stream()
                .map(s -> Integer.valueOf(s))
                .filter(s -> s % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
    }

    private static long testCount(List<String> stringList) {
        return stringList.stream()
                .map(s -> Integer.valueOf(s))
                .filter(s -> s % 2 == 0)
                .count();
    }

    private static void testForEach(List<String> stringList) {
        stringList.stream()
                .map(s -> Integer.valueOf(s))
                .filter(s -> s % 2 == 0)
                .forEach(System.out::print);
    }
}
