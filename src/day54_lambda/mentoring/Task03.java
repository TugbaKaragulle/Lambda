package day54_lambda.mentoring;

import java.util.List;

public class Task03 {
    public static void main(String[] args) {

List<String> words = List.of("apple", "car", "banana", "hat", "umbrella" ,"coat" , "phone");

    // T A S K 01) Belirli Uzunluktaki(5) Kelimeleri Filtreleyip Büyük Harfle Yazdırma

        words.stream().filter(t -> t.length()==5).forEach(t -> System.out.print(t.toUpperCase()+" "));

        //TODO: map ile :
        // words.stream().filter(t->t.length()==5).map(t -> t.toUpperCase()).forEach(SeedMethods::yazdir);

    // T A S K 02) Uzunluğu 4 veya daha fazla olan kelimeleri seçip büyük harf ile yazdırma.
        System.out.println();

        words.stream().filter(t -> t.length()>=4).forEach(t -> System.out.print(t.toUpperCase()+" "));


    }
}
