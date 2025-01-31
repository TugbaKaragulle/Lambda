package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Map;

public class Task06 {
    public static void main(String[] args) {

     Map<String, Integer> scores = Map.of(
 "Math", 85,
 "Science", 50,
 "English", 75
 );
// T A S K 01) Map İçinde notu 70 den buyuk olanların ders ve notunu yazdıralım.


        scores.entrySet().stream().filter(t -> t.getValue()>70).forEach(SeedMethods::yazdir);

    }
}
