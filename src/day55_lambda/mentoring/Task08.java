package day55_lambda.mentoring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {

        // T A S K 08) Bir List<Integer> içindeki tüm sayıların palindrom olup olmadığını kontrol eden bir program yazın.
// Palindrom sayılar, tersten de okunduğunda aynı olan sayılardır (örneğin: 121, 2332).
        List<Integer> numbers = Arrays.asList(121, 2332, 12321);

      boolean palindromeMu =  numbers
                .stream()
                .allMatch(t->new StringBuilder(t.toString()).reverse().toString().equals(t.toString()));

        System.out.println(palindromeMu ? "Tüm sayilar palindrom" : "Tüm sayilar palindrom degil");
        System.out.println();


        //Alternatif Cözüm:

        List<Integer> numberS = Arrays.asList(121, 2332, 12321);
        System.out.println(numberS
                .stream()
                .map(String::valueOf)
                .allMatch(t -> t.contentEquals(new StringBuilder(t).reverse())));


    }

}
