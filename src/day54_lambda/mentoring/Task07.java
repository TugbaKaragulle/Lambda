package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {

    //  map()
     List<Integer> sayi = new ArrayList<>(Arrays.asList(10,20,30,40,50));
    //  listedeki sayıların her birinin 10 a bölümünü yazdıralım

        sayi.stream().map(t-> t/10).forEach(SeedMethods::yazdir);
    //  Listedeki sayıların her birinin 10 a bölümlerinin 2 eksiğini yazdıralım
        System.out.println();

        sayi.stream().map(t-> (t/10)-2).forEach(SeedMethods::yazdir);


    }
}
