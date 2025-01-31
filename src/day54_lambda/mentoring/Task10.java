package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {


        //  map() --> M E T H O D  R E F E R A N S  ile çözelim
List<Integer> sayi = new ArrayList<>(Arrays.asList(10,20,30,40,50));
//  listedeki sayıların her birine 3 ekleyip , karekokunu alıp 7 azaltalım
//  her bir elemana 3 ekleme methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
//  her bir elemanın karekökünü alma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
//  her bir elemanadan 7 azaltma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim

        sayi.stream().map(Task10::ucEkle).map(Task10::karekokunuAl).map(Task10::yediAzalt).forEach(SeedMethods::yazdir);
        //sonuc: -3.394448724536011 -2.204168476687281 -1.2554373534619714 -0.44256147569799964 0.28010988928051805

    }

    public static int ucEkle(int sayi){
        List<Integer>sayilarim = new ArrayList<>();

        return sayi+=3;
    }
    public static double karekokunuAl(int sayi){

        return Math.sqrt(sayi);
    }

    public static double yediAzalt(double sayi){

        return sayi-=7;
    }


}
