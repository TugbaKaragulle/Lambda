package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.List;

public class Task04 {

    public static void main(String[] args) {

        List<String> texts = List.of("Java", "", "Lambda", "  ", "Streams", "");
        // T A S K 01) Boş Olmayan Elemanları Filtreleyip Yazdırma

        texts.stream().filter(SeedMethods::listBosDegilseYazdir).forEach(SeedMethods::yazdir);

        //Alternatif Sengül hanimin:
       // texts.stream().filter(t-> !t.isBlank()).forEach(SeedMethods::yazdir);


        //Alternatif2 Azize hanimin:
        texts.stream().filter(n -> !n.trim().isEmpty()).forEach(SeedMethods::yazdir);

    }


}

