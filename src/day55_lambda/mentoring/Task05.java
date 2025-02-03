package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task05 {

    public static void main(String[] args) {

        // T A S K 05 ) list elemanlarinin son harfine gore ters sirali print ediniz.
        List<String> isim = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));

        isim
                .stream()
                .sorted(Comparator.comparing(SeedMethods::getSonKarakter).reversed())
                .forEach(SeedMethods::yazdir);


    }
}
