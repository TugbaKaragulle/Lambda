package day53_lambda;
@FunctionalInterface
public interface MathOperations {


    // Kendi fonksiyonel arayüzlerimizi tanımlayıp lambda ifadeleriyle kullanabiliriz.
    // Bunun için @FunctionalInterface tag ı ile içinde sadece bir abstract metod olan interface oluşturmalıyız


        double calculate(int a,int b);

        default void selamla(){
            System.out.println("Selamlar arkadaslar sevdiniz mi lambdayi?");
        }


    }


