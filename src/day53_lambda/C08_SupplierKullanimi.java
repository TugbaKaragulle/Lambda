package day53_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class C08_SupplierKullanimi {

    public static void main(String[] args) {
 //Parametre almaz, bir sonuc döndürür.

// Supplier kullanımı
        Supplier<List<C03_PersonPojoClass>> initialList = () -> new ArrayList<>(List.of(new C03_PersonPojoClass("Azize",25),new C03_PersonPojoClass("Dilara",12)));

        List<C03_PersonPojoClass> baslangicListesi = initialList.get();
        baslangicListesi.forEach(t -> System.out.println(t));
    }
}
