package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {

        // map()
List<Integer> sayi = new ArrayList<>(Arrays.asList(1,4,9,16,25,36,49,64,81,100,121,144));

// Listedeki elemanlardan karekokÜ çift olanları aralarında boşluk olacak şekilde yazdıralım

        sayi.stream().map(t->(int)Math.sqrt(t)).filter(t->t%2==0).forEach(SeedMethods::yazdir); //2 4 6 8 10 12


    }
}
