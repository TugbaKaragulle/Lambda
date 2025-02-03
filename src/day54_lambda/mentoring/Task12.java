package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {

        // reduce()
        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 18, 20, 32, 40, 55));
        // Listedeki 8 e bölünebilen sayıların carpımını bulalım

        int carpim = sayi.stream().filter(t->t%8==0).reduce((t,u)-> t*u).get();

        System.out.println("carpim = " + carpim);


    }
}
