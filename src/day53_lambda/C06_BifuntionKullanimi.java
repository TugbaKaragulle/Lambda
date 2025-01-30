package day53_lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class C06_BifuntionKullanimi {

    public static void main(String[] args) {

        //2 parametre alir bir sey return eder


        BiFunction<Integer, Integer, Integer> exponent = (a, b) -> {
            return (int) Math.pow(Double.valueOf(a), Double.valueOf(b));
        };
        System.out.println(exponent.apply(2, 3));

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 50);
        scores.put("Veli", 70);


    }
}
