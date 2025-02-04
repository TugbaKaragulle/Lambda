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

        boolean mathBolumuVarmi =
                unv
                        .stream()
                                .anyMatch(t->t.getBolum().equalsIgnoreCase("Matematik"));

        System.out.println("mathBolumuVarmi = " + mathBolumuVarmi);

        System.out.println("\n****Task 04*****");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.

        List<C06_University>ogrenciSayisinaGöreSiraliUnivList =
        unv
                .stream()
                        .sorted(Comparator.comparing(C06_University::getOgrSayisi).reversed())
                                .toList();

        System.out.println("ogrenciSayisinaGöreSiraliUnivList = " + ogrenciSayisinaGöreSiraliUnivList);
        //ogrenciSayisinaGöreSiraliUnivList = [universite='Marmara', bolum='Hukuk', ogrSayisi=1453, notOrt=52.0,
        // universite='Istanbul', bolum='Matematik', ogrSayisi=622, notOrt=77.0,
        // universite='Bogazici', bolum='Matematik', ogrSayisi=571, notOrt=73.0,
        // universite='Itu', bolum='uçak muh.', ogrSayisi=333, notOrt=63.0,
        // universite='Yıldız Teknik', bolum='Gemi ', ogrSayisi=216, notOrt=55.0]


        System.out.println("\n****Task 05*****");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...

        unv
                .stream()
                        .sorted(Comparator.comparing(C06_University::getNotOrt).reversed())
                                .limit(3)
                                        .forEach(SeedMethods::yazdir);
        //universite='Istanbul', bolum='Matematik', ogrSayisi=622, notOrt=77.0
        // universite='Bogazici', bolum='Matematik', ogrSayisi=571, notOrt=73.0
        // universite='Itu', bolum='uçak muh.', ogrSayisi=333, notOrt=63.0

        System.out.println("\n****Task 06*****");
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...

        System.out.println(unv
                .stream()
                .sorted(Comparator.comparing(C06_University::getOgrSayisi))
                .skip(1)
                .findFirst()
                .get()); //universite='Itu', bolum='uçak muh.', ogrSayisi=333, notOrt=63.0

        System.out.println("\n****Task 07*****");
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...

      int sum =  unv
                .stream()
                .filter(t -> t.getNotOrt() > 63)
                .map(t->t.getOgrSayisi()) // Böyle de yazabilirdik:----> .map(C06University::getOgrSayisi)
                        .reduce(0,(t,u)->t+u); //Böyle de yazabilirdik:----> .reduce(0, Math::addExact));

        System.out.println("sum = " + sum); //sum = 1193

        //2. Yol:

        System.out.println(unv
                .stream()
                .filter(t -> t.getNotOrt() > 63)
                .mapToDouble(C06_University::getOgrSayisi)//Toplama, ya da ortalama bulmak icin kullaniriz bunu
                .sum()); //1193.0

        System.out.println("\n****Task 08*****");
        //task08-> Ogrenci sayisi 333'ten buyuk olan universite'lerin notOrtalamalarinin ortalamasini print eden code create ediniz...

        System.out.println(unv
                .stream()
                .filter(t -> t.getOgrSayisi() > 333)
                .mapToDouble(C06_University::getNotOrt)
                .average()
                .getAsDouble());//67.33333333333333 //alternatif yazdirma ---> .orElse(0.0) // Eger yoksa 0.0(double) yazdiracak //isPresent da var.





        System.out.println("\n****Task 09*****");
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

        System.out.println(unv
                .stream()
                .filter(t -> t.getBolum().equalsIgnoreCase("matematik"))
                .count()); //2


        System.out.println("\n****Task 10*****");
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...

        System.out.println(unv
                .stream()
                .filter(t -> t.getOgrSayisi() > 571)
                .sorted(Comparator.comparing(C06_University::getNotOrt).reversed())
                .mapToDouble(C06_University::getNotOrt)
                .max()
                .getAsDouble());  //77.0

        //2.Yol:

        unv
                .stream()
                .filter(t -> t.getOgrSayisi() > 571)
                .sorted(Comparator.comparing(C06_University::getNotOrt).reversed())
                        .map(C06_University::getNotOrt)
                                .limit(1)
                                        .forEach(SeedMethods::yazdir); //77.0



        System.out.println("\n****Task 11*****");
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...

        System.out.println(unv
                .stream()
                .filter(t -> t.getOgrSayisi() < 1071)
                .mapToDouble(C06_University::getNotOrt)
                .min().getAsDouble()); //55.0

        //2.Yol::

        unv
                .stream()
                .filter(t -> t.getOgrSayisi() < 1071)
                .sorted(Comparator.comparing(C06_University::getNotOrt))
                .map(C06_University::getNotOrt)
                .limit(1)
                .forEach(System.out::println); //55.0

    }
}
