package day54_lambda;

import java.util.List;

public class SeedMethods {

    public static void yazdirInt(int num) {
        System.out.print(num + " ");
    }

    public static <T> void yazdir(T eleman) {  //Generic method
        System.out.print(eleman + " ");
    }

    public static boolean ciftMi(int number) {

        return number % 2 == 0;
    }

    public static boolean sayidanKucukVeCiftMi(int number) {

        return (number % 2 == 0) && (number < 35);
    }

    public static boolean listBosDegilseYazdir(String word) {

        if (!word.isEmpty()) {
            return true;
        } else return false;

    }

    public static int karesiniAl(int number){

        return (int) Math.pow(number,2);
    }

    public static int maxBul(int number1,int number2){
        // return Integer.max(number1,number2);
        return number1 > number2 ? number1 : number2;
    }

}
