package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.List;

public class Task01 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-5, 10, -3, 7, 0, 8);

       // T A S K 01) Pozitif Sayıları Yazdıralım

        numbers.stream().filter(t -> t>0).forEach(SeedMethods::yazdir);

       // T A S K 02) Negatif sayıları yazdıralım
        System.out.println();
        System.out.println("******TASK02*******");

        numbers.stream().filter(t -> t<0).forEach(SeedMethods::yazdir);

    }
}
