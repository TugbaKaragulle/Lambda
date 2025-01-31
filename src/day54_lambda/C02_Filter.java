package day54_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {

    /*
    Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır

     */

    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task01**************");

        ciftSayilariYazdir(sayiList);

        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task02**************");

        ciftSayilariFonksiyonelYazdir(sayiList);

        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task03**************");

        nDenKucukCiftSayilariYazdir(sayiList, 35);


        //task04-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task04**************");

        nDenBuyukVeyaTekSayilariYazdir(sayiList, 35);


    }

    private static void nDenBuyukVeyaTekSayilariYazdir(List<Integer> sayiList, int num) {

        sayiList.stream().filter(t-> t>num || t%2!=0).forEach(SeedMethods::yazdir);

    }

    private static void nDenKucukCiftSayilariYazdir(List<Integer> sayiList, int num) {

        sayiList.stream().filter(SeedMethods::ciftMi).filter(t -> t<num).forEach(SeedMethods::yazdir);
        //filter( t -> t<num && t%2==0) //Böyle de yazabilirdik tek filter'da methodlastirmadan

    }

    private static void ciftSayilariFonksiyonelYazdir(List<Integer> sayiList) {
        sayiList.
                stream(). //Collection akisa alindi
                //filter(t-> t%2 ==0). //Akistaki elemanlari teker teker süzdük
                filter(SeedMethods::ciftMi). //yukaridakinin methodla alternatifi
                forEach(SeedMethods::yazdir); //Akistaki elemanlari teker teker yazdirdik

    }

    private static void ciftSayilariYazdir(List<Integer> sayiList) {

        for (Integer num : sayiList){
            if (num%2==0){
                System.out.print(num+" ");
            }

        }

    }

}
