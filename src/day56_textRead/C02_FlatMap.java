package day56_textRead;

import day54_lambda.SeedMethods;

import java.io.IOException;
import java.util.Arrays;

import static day56_textRead.C01_TextRead.dosyaAkisi;

public class C02_FlatMap {

    /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.
 */

    public static void main(String[] args) throws IOException {
        System.out.println("****Task 05*****");
        //TASK 05 -> hedefDosyasındaki farkli kelimeleri  print ediniz..

        String yol = "src/day56_textRead/JavaBiterken";

        dosyaAkisi(yol)
                .map(t -> t.split(" "))
                .forEach(t -> Arrays.stream(t).distinct().forEach(System.out::println));
        System.out.println();

        //2.Yol

        dosyaAkisi(yol)
                .map(t -> t.split(" "))
                        .flatMap(Arrays::stream)
                                .distinct()
                                        .forEach(System.out::println);




        System.out.println("\n****Task 06*****");
        //TASK 06 -> hedefDosyasındaki tum kelimeleri natural order  print ediniz..
        dosyaAkisi(yol)
                .map(t-> t.toLowerCase().replaceAll("[:).]","").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                        .forEach(System.out::println);


        System.out.println("\n****Task 07*****");
        //TASK 07 -> hedefDosyasında "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("basari"))
                .count());


        System.out.println("\n****Task 08*****");
        //TASK 08 -> hedefDosyasında "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.

        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .count());



        System.out.println("\n****Task 09*****");
        //TASK 09 -> hedefDosyasında icinde "a" harfi gecen kelimeleri print ediniz.

        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                        .forEach(SeedMethods::yazdir);

        System.out.println("\n****Task 10*****");
        //TASK 10 -> hedefDosyasında kac /farklı harf kullanildigini print ediniz.

        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).' ]", "").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count());

        //Farkli harflerin her birini görmek icin
        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).' ]", "").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(SeedMethods::yazdir);


        System.out.println("\n****Task 11*****");
        //TASK 11 -> hedefDosyasında kac farkli kelime kullanildigini print ediniz.

        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).']", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());


        System.out.println("\n****Task 12*****");
        //TASK 12 -> hedefDosyasındaki  farkli kelimeleri print ediniz.

        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(SeedMethods::yazdir);

    }
}
