package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {

        // map()
        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144));
       // Listedeki elemanlardan karekokÜ çift olanları ve 10 dan kuçük olanları aralarında boşluk olacak şekilde yazdıralım

        sayi.stream().map(t->(int)Math.sqrt(t)).filter(t->t%2==0 && t<10).forEach(SeedMethods::yazdir);




    }
}
