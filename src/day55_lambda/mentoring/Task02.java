package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Map;

public class Task02 {
    public static void main(String[] args) {

        // T A S K 02) Map deki kelimeleri uzunluklarına göre artan sırayla sıralayın ve sonuçları ekrana yazdırın.
        Map<String, Integer> wordLengths = Map.of(
                "Banana", 6,
                "Apple", 5,
                "Cherry", 6,
                "Date", 4
        );

        wordLengths.values().stream()
                .sorted()
                .forEach(SeedMethods::yazdir);



    }
}
