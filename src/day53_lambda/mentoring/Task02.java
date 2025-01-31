package day53_lambda.mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task02 {
    public static void main(String[] args) {

        //Listin ilk elemaninin lengthini yazdir

        List<String> list = new ArrayList<>(List.of("Ali", "Ahmet"));

        ListArayuz kelimeUzunlugu = listem -> {

            return listem.get(0).length();
        };

        int uzunluk = kelimeUzunlugu.method1(list);

        System.out.println(uzunluk);


    }
}

