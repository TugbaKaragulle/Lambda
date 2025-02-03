package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        /// T A S K 01) Listedeki sayıların 49 dan buyuk olanlarını kucukten buyuge print ediniz
        List<Integer> sayi = new ArrayList<>(Arrays.asList(1,4,9,16,25,36,49,64,81,100,121,144));

        sayi
                .stream()
                .filter(t->t>49)
                .sorted()
                .forEach(SeedMethods::yazdir);






    }
}
