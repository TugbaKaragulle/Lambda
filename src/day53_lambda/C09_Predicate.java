package day53_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class C09_Predicate {

    public static void main(String[] args) {

        //Bir parametre alir. True ya da false döndürür.

        Supplier<List<C03_PersonPojoClass>> initialList = () -> new ArrayList<>(List.of(new C03_PersonPojoClass("Azize",25),new C03_PersonPojoClass("Dilara",12)));
        List<C03_PersonPojoClass> baslangicListesi = initialList.get();
        baslangicListesi.forEach(t -> System.out.println(t));

        // Predicate Kullanımı

        Predicate<C03_PersonPojoClass> isResit = kisi -> {return kisi.getAge()>= 18;};

        System.out.println("isResit.test(baslangicListesi.get(0)) = " + isResit.test(baslangicListesi.get(0)));
        System.out.println("isResit.test(baslangicListesi.get(1)) = " + isResit.test(baslangicListesi.get(1)));

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        numbers.removeIf(num -> num %2 ==0);
        System.out.println("numbers = " + numbers);


    }
}
