package day54_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C03_Map {

    /*
    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayar
     */

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("****Task01****");
        // Task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print eden code create ediniz.


        ciftSayilarinKaresiniYazdir(sayiList);

        System.out.println("\n****Task02****");
        // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print eden code create ediniz.

        sayiList.
                stream().
                filter(Predicate.not(SeedMethods::ciftMi)). //Sayi cift degilse yazdiracak
                map(t ->(int)Math.pow(t,3)+1).forEach(SeedMethods::yazdir);

        System.out.println();

        System.out.println("\n****Task03****");
        // Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print eden code create ediniz.

        sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                map(t ->(int)Math.sqrt(t)).
                forEach(SeedMethods::yazdir);

    }

    private static void ciftSayilarinKaresiniYazdir(List<Integer> sayiList) {

        //Methodsuz

        //sayiList.stream().filter(SeedMethods::ciftMi).map(t ->(int)Math.pow(t,2)).forEach(SeedMethods::yazdir);
        //System.out.println();

        //methodu kullanarak

        sayiList.stream().filter(SeedMethods::ciftMi).map(SeedMethods::karesiniAl).forEach(SeedMethods::yazdir);

    }
}
