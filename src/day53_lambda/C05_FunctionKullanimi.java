package day53_lambda;

import java.util.function.Function;

public class C05_FunctionKullanimi {
    public static void main(String[] args) {

        //Function arayüz kullanimi:
        //Bir parametre alir bir sey return eder
        Function<String, Integer> stringUzunlugu = edip -> {
            return edip.trim().length();
        };

        String str = "Ey Edip Tugba Hanimin dedigini yap";

        String str2 = "Başka cümle";

        Integer uzunluk = stringUzunlugu.apply(str);
        Integer uzunluk2 = stringUzunlugu.apply(str2);
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + uzunluk2);
    }
}
