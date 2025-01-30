package day53_lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class C03_JavadaTanimliFonksArayüzler {


    public static void main(String[] args) {

        //C04_Person Pojo Classiyla neler yapabilecegimizin bir örnegi (Extra yaptik)

        Function<List<C03_PersonPojoClass>, Integer> toplamYas = personList ->{
            int sum =0;
            for (C03_PersonPojoClass kisi: personList){
                sum+= kisi.getAge(); //yaslari toplayip sum icinde topluyor
            };
            return sum;
        };

        Integer toplam = toplamYas.apply(new ArrayList<>(List.of(new C03_PersonPojoClass("Azize",25),new C03_PersonPojoClass("Dilara",32))));
        System.out.println("toplam = " + toplam); //yaslarin toplami --> / toplam = 57



         //Function arayüz kullanimi:
        Function<String, Integer> stringUzunlugu = edip -> {
            return edip.trim().length();
        };

        String str = "Ey Edip Tugba Hanimin dedigini yap";

        String str2 = "Başka cümle";

        Integer uzunluk = stringUzunlugu.apply(str);
        Integer uzunluk2 = stringUzunlugu.apply(str2);
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + uzunluk2);

        // BiFunction Kullanımı:
        BiFunction<Integer, Integer, Integer> exponent = (a, b) -> {
            return (int) Math.pow(Double.valueOf(a), Double.valueOf(b));
        };
        System.out.println(exponent.apply(2, 3));

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 50);
        scores.put("Veli", 70);



    }
}
