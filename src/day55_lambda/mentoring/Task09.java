package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Arrays;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {

        // T A S K 09) Liste içindeki öğelerin hiçbiri yalnızca harflerden oluşmamalıdır (java gibi bir giriş kabul edilmez).

        List<String> elements = Arrays.asList("abc123", "1234", "lambda@", "!@#", "java8");


           boolean yalnizcaHarflerdenMiOlusuyor =
                 elements
                .stream()
                .anyMatch(t->t.matches("^[a-zA-Z]+$"));

        System.out.println(yalnizcaHarflerdenMiOlusuyor ?"Yalnizca harflerden olusan bir kelime var" : "Listteki kelimeler yalnizca harflerden olusmuyor" );


    }
}
