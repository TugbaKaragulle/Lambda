package day55_lambda;

import day54_lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_LambdaObject {
    public static void main(String[] args) {

        C06_University u01 = new C06_University("Bogazici", "Matematik", 571, 73);
        C06_University u02 = new C06_University("Istanbul", "Matematik", 622, 77);
        C06_University u03 = new C06_University("Marmara", "Hukuk", 1453, 52);
        C06_University u04 = new C06_University("Itu", "uçak muh.", 333, 63);
        C06_University u05 = new C06_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C06_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("unv = " + unv);
        System.out.println("****Task 01*****");

        // Task01-> Tum notOrt'larının 74'den buyuk oldg control eden code create ediniz...

        boolean tumUnivlerinNotOrtalamasi74TenBuyukMu =
        unv
                .stream()
                        .allMatch(t->t.getNotOrt()>74);

        System.out.println("tumUnivlerinNotOrtalamasi74TenBuyukMu = " + tumUnivlerinNotOrtalamasi74TenBuyukMu);


        System.out.println("\n****Task 02*****");
        //task02->ogrc sayilarinin 110 den az olmadigini  kontrol eden code create ediniz.

        boolean ogrenciSayisi110DanAzMi =
                unv
                        .stream()
                                .anyMatch(t->t.getOgrSayisi()<110);

        System.out.println("ogrenciSayisi110DanAzMi = " + ogrenciSayisi110DanAzMi);

        System.out.println("\n****Task 03*****");
        //task03->universite'lerde herhangi birinde "matematik" bolumu olup olmadigini  kontrol eden code create ediniz.

        System.out.println("\n****Task 04*****");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.

        List<C06_University>ogrenciSayisinaGöreSiraliUnivList =
        unv
                .stream()
                        .sorted(Comparator.comparing(C06_University::getOgrSayisi).reversed())
                                .toList();

        System.out.println("ogrenciSayisinaGöreSiraliUnivList = " + ogrenciSayisinaGöreSiraliUnivList);


        System.out.println("\n****Task 05*****");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...

        unv
                .stream()
                        .sorted(Comparator.comparing(C06_University::getNotOrt).reversed())
                                .limit(3)
                                        .forEach(SeedMethods::yazdir);

        System.out.println("\n****Task 06*****");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...

        System.out.println(unv
                .stream()
                .sorted(Comparator.comparing(C06_University::getOgrSayisi))
                .skip(1)
                .findFirst()
                .get());

        System.out.println("\n****Task 07*****");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...

        System.out.println("\n****Task 08*****");
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...

        System.out.println("\n****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

        System.out.println("\n****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...

        System.out.println("\n****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...




    }
}
