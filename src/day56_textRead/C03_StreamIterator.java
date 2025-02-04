package day56_textRead;

import day54_lambda.SeedMethods;

import java.util.stream.IntStream;

public class C03_StreamIterator {

    public static void main(String[] args) {

        System.out.println("****Task 01*****");
        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.

        System.out.println(ameleToplama(10)); //45
        System.out.println(karizmatifToplama(10)); //45

        System.out.println("****Task 02*****");
        //TASK 02 --> 1'den x'e kadar (x dahil) cift tamsayilari toplayan bir code create ediniz

        ciftTamSayilariTopla(10);

        System.out.println(ciftTamSayilariTopla(10)); //20


        System.out.println("****Task 03*****");
        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.

        System.out.println(ilkxCiftTamSayiyiToplami1(10));
        System.out.println(ilkxCiftTamSayiyiToplamiItr(10));

        System.out.println("\n****Task 04*****");
        //TASK 04 --> Ilk X adet pozitif tek tamsayiyi toplayan programi  create ediniz.

        System.out.println(ilkxTekSayiToplami(10));

        System.out.println("\n****Task 05*****");


        System.out.println("\n****Task 06*****");
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.

        System.out.println("\n****Task 07*****");
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.

        System.out.println("\n****Task 08*****");
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.



    }

    private static int ilkxTekSayiToplami(int x) {
        return IntStream
                .iterate(1,t->t<=x, t-> t+2) //Sonsuza kadar dönmesini engellemek icin for yapisi gibi kullaniriz. Böylece limite gerek kalmadi
                .sum();

    }

    private static int ilkxCiftTamSayiyiToplami1(int x) {

        return IntStream
                .range(1,3*x)
                .filter(SeedMethods::ciftMi)
                .limit(x)
                .sum();

    }

    private static int ilkxCiftTamSayiyiToplamiItr(int x) {

        return IntStream
                .iterate(2,t->t+2) //Sonsuza kadar her döngüde seed degerini 2 artiran döngü
                .limit(x)
                .sum();

    }

    private static int ciftTamSayilariTopla(int x) {

        return IntStream
                .range(1,x)
                .filter(SeedMethods::ciftMi)
                .sum();

    }

    private static int karizmatifToplama(int x){
        return IntStream
                .range(1,x) //1 dahil ama 10 dahil degil
                //.range(1,10) //1 dahil ama 10 dahil degil
                //.rangeClosed(1,10) //hem 1 hem de 10 dahil
                .sum();

    }

    private static int ameleToplama(int x){
        int sum =0;
        for (int i = 1; i < 10; i++) {
            sum+=i;
        }
        return sum;
    }
}
