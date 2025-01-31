package day54_lambda.mentoring;

import day54_lambda.SeedMethods;

import java.time.LocalDate;
import java.util.List;

public class Task05 {

    public static void main(String[] args) {

 List<LocalDate> dates = List.of(
  LocalDate.of(2025, 1, 1),
  LocalDate.of(2023, 5, 10),
  LocalDate.now().plusDays(2)
);
// T A S K 01)  yalnızca bugünden sonra olan tarihleri filtreleyip ve yazdıralım.

        dates.stream().filter(t -> t.isAfter(LocalDate.now())).forEach(SeedMethods::yazdir);




    }

}
