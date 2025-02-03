package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {

    public static void main(String[] args) {

        // T A S K 07) Listedeki elemanlardan karakter sayısı 6 olanların herhangi brinin  "a" harfi içerip içermediğini kontrol ediniz
        List<String> names = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));

        boolean aVarMi = names
                .stream()
                .filter(t->t.length()==6)
                .anyMatch(t->t.contains("a"));

        System.out.println("aVarMi = " + aVarMi);


    }
}
