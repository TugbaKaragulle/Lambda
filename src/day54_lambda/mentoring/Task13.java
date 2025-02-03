package day54_lambda.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {

        // reduce()
  List<String> sayi = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
//  Listedeki elemanların karakter sayılarının karesinin max değerini bulunuz ve print ediniz
//  Listedeki elemanların karakter sayılarının küplerinin min değerini bulunuz ve print ediniz


       double maxValue = sayi.stream().map(Task13::lengthBul).map(t->Math.pow(t,2)).reduce((t,u)-> t>u ? t:u).get();
        System.out.println("maxValue = " + maxValue);

        double minValue = sayi.stream().map(Task13::lengthBul).map(t->Math.pow(t,3)).reduce((t,u)-> t<u ? t:u).get();
        System.out.println("minValue = " + minValue);


    }

    public static int lengthBul(String a){

        int length = a.length();
        return length;
    }


}
