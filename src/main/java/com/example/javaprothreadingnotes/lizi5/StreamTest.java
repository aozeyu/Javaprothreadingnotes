package com.example.javaprothreadingnotes.lizi5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List names = Arrays.asList("Reflection","Collection","Stream");
        System.out.println(names);
        List result = (List) names.stream().filter(s -> s.equals("Reflection")).collect(Collectors.toList());
        System.out.println(result);
    }
}
