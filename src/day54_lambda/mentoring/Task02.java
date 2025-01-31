package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.List;

public class Task02 {
    public static void main(String[] args) {

List<String> names = List.of("Ali", "Ahmet", "Mehmet", "Ayşe", "Veli");

// T A S K 01) "a" Harfiyle Başlayan İsimleri Seçip Yazdırma

        names.stream().filter(t-> t.toLowerCase().startsWith("a")).forEach(SeedMethods::yazdir);
                //forEach(t -> System.out.print(t+" ")); //alternatif
        System.out.println();

// T A S K 02) "t" Harfiyle biten isimleri Seçip Yazdırma

        names.stream().filter(t-> t.toLowerCase().endsWith("t")).forEach(SeedMethods::yazdir);

    }
}
