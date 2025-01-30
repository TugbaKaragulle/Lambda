package day53_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class C07_ConsumerKullanimi {

    public static void main(String[] args) {
        //Bir parametre alir ama sonuc döndürmez

        // Consumer kullanımı
        Consumer<C03_PersonPojoClass> selamla = (kisi) -> {
            System.out.println(kisi.getName() + " sizi sevgi ile selamlıyor");
        };

        selamla.accept(new C03_PersonPojoClass("Mertay",35));

        List<String> names = Arrays.asList("Ali", "Veli", "Ayşe");
        names.forEach(name -> System.out.println("İsim = "+ name));




    }
}
