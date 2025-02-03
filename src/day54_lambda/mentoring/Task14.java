package day54_lambda.mentoring;

import java.util.List;

public class Task14 {
    public static void main(String[] args) {

 // reduce()
 List<String> words = List.of("Java", "Lambda", "Stream", "Reduce");
// liste içindeki kelimeleri aralarında virgül olacak şekilde birleştirerek tek bir String haline getir.
// Çıktı:
// "Java, Lambda, Stream, Reduce"

String sentence = words.stream().reduce((t,u)->t+", "+u).get();

        System.out.println("sentence = " + sentence);

    }
}
