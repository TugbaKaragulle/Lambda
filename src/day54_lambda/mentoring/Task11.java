package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task11 {

    public static void main(String[] args) {

        //  map() --> M E T H O D  R E F E R A N S  ile çözelim
List<Integer> sayi = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
//  Listedeki tüm sayılara 1 ile 10 arası random bir sayı ekle ve aralarında boşluk olacak şekilde yazdır
//  Listedeki tüm sayılardan 1 ile 10 arası random bir sayı ekle , 1 ile 10 arası random bir sayı ekle çıkar
//  METHOD REFERANS kullanarak aralarında boşluk olacak şekilde yazdırın

        sayi.stream().map(Task11::randomSayiEkle).forEach(SeedMethods::yazdir); //2 4 12 9 9 10 12 16 16 15 17

        System.out.println();

        sayi.stream().map(Task11::randomSayiCikar).forEach(SeedMethods::yazdir); //-4 -6 -6 -1 -2 -1 -1 0 -2 2 1


    }
    public static int randomSayiEkle(int sayi){

        Random random = new Random();
        int randomSayi;
        randomSayi  = random.nextInt(10)+1;
        return sayi+randomSayi;
    }

    public static int randomSayiCikar(int sayi){

        Random random = new Random();
        int randomSayi;
        randomSayi  = random.nextInt(10)+1;
        return sayi-randomSayi;
    }
}
