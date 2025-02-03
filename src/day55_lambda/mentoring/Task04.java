package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {

        // T A S K 04) Bir String listesinde her elemanı tersine çevirip alfabetik sıraya göre sıralayın ve yazdırın.
        List<String> wordsFruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        wordsFruits
                .stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .forEach(SeedMethods::yazdir);


    }
}
