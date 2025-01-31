package day53_lambda.mentoring;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Ali", "Ahmet"));

        // Listin size ını verir
        ListArayuz lists = liste -> {
            return liste.size();
        };
        Integer size = lists.method1(list);
        System.out.println("size = " + size);


        ListArayuz lenghtToplamları = liste -> {
            Integer sum = 0;
            for (String s : liste) {

                sum+=(s.length());
            }
            return sum;
        };

        Integer toplam =  lenghtToplamları.method1(list);
        System.out.println("toplam = " + toplam);
    }
}
