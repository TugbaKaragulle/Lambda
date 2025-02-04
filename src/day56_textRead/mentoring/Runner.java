package day56_textRead.mentoring;

import day54_lambda.SeedMethods;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {



    Employee e1 = new Employee("Sengul", 34, "IT", 57.000);
    Employee e2 = new Employee("Mertay", 24, "General Operation", 35.000);
    Employee e3 = new Employee("Fatma", 36, "General Operation", 47.000);
    Employee e4 = new Employee("Tugba", 25, "IT", 55.000);
    Employee e5 = new Employee("Mehmet", 33, "General Operation", 41.000);
    Employee e6 = new Employee("Rabia", 22, "Project Office", 25.000);
    Employee e7 = new Employee("Azize", 35, "Project Office", 25.000);

        // T A S K 01) Maaşı 30.000'den fazla olan çalışanları listele ve adlarını büyük harfle yazdır:

        List<Employee> myList = new ArrayList<>();

        myList.add(e1);
        myList.add(e2);
        myList.add(e3);
        myList.add(e4);
        myList.add(e5);
        myList.add(e6);
        myList.add(e7);

                myList.stream()
                        .filter(t->t.getSalary() > 30.000)
                        .map(t->t.getName().toUpperCase())
                        .forEach(System.out::println);



        // T A S K 02) Çalışanların yaş ortalamasını bul (yaş filtresi: sadece 30-50 yaş aralığı):

        System.out.println(myList
                .stream()
                .filter(t -> t.getAge() > 30 && t.getAge() < 50)
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble());  //34.5
        System.out.println();


        // T A S K 03) Her departmanda çalışan sayısını gruplayarak yaz:


        //Profesyonel yöntem:


       Map<String,Long> mapim =  myList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println(mapim);


        // ACEMI YÖNTEMI

        System.out.print("IT calisan sayisi: "); System.out.println(myList
                .stream()
                .map(Employee::getDepartment)
                .filter(t -> t.contains("IT"))
                .count());

        System.out.print("General Operation calisan sayisi: "); System.out.println(myList
                .stream()
                .map(Employee::getDepartment)
                .filter(t -> t.contains("General Operation"))
                .count());

        System.out.print("Project Office calisan sayisi: "); System.out.println(myList
                .stream()
                .map(Employee::getDepartment)
                .filter(t -> t.contains("Project Office"))
                .count());

        // T A S K 04) İlk 3 yüksek maaşlı çalışanı bul ve listele:

        myList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .forEach(SeedMethods::yazdir);
        System.out.println();


        // T A S K 05) Her çalışanı maaşlarına göre maaş zammı hesaplayarak (örnek: %10) yeni maaşla göster:

        myList
                .stream()
                .map(t->t.getSalary()*1.10)
                .forEach(SeedMethods::yazdir);

        System.out.println();



        // T A S K 06) Eğer maaşı 35,000 TL'nin altında olan çalışan varsa, bu çalışanların maaşını %20 artırın.


        // T A S K 07) "IT" departmanındaki tüm çalışanların isimlerinin sonuna " - Senior" ekleyin.

        myList
                .stream()
                .filter(t->t.getDepartment().contains("IT"))
                .map(t->t.getName().concat("- Senior, "))
                .forEach(SeedMethods::yazdir);
        System.out.println();

        // stream() olmadan Melisa hocanin cözümü kalici degiklikle,, stream kullaninca kopyasi geliyor o yüzden degisiklik kalici olmuyor:

        myList.forEach(emp -> {
            if (emp.getDepartment().equals("IT")) {
                emp.setName(emp.getName()+" - Senior");
            }
        });

        System.out.println("employee : "+myList);


    }

}
