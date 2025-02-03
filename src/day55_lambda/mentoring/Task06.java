package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Arrays;
import java.util.List;

public class Task06 {

    public static void main(String[] args) {

        // T A S K 06) List içinde benzersiz olan çift sayıların toplamını bulun.
        List<Integer> numbers = Arrays.asList(4, 6, 4, 8, 10, 8, 12, 14, 14);

       int sum = numbers
                .stream()
                .distinct()
               .filter(SeedMethods::ciftMi)
                .reduce(Integer::sum).get();

        System.out.println(sum);


    }

}
