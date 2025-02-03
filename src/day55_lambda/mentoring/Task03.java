package day55_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.util.Arrays;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {

// T A S K 03) Bir kelime listesi içinde alfabetik olmayan karakterleri temizleyip kalanları alfabetik sırayla yazdırın.
        List<String> words = Arrays.asList("Banana123", "Ap@ple!", "Ch#erry", "D@te");

        words
                .stream()
                .map(t-> t.replaceAll("\\W","")).sorted().forEach(SeedMethods::yazdir);


    }
}
