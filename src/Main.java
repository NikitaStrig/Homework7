public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int solary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + solary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("Задание 2");
        int b = 0;
        while (b <= 9) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println(" ");
        for (b = 10; b >= 1; b--)
            System.out.print(b + " ");
        System.out.println("Задание 3");


        System.out.println("Задание 4/5/6");
       // int solaryA = 15_000;
        double totalA = 15000;
        double pr = 0.07;
        int iA = 0;
        while (iA < 108) {
            totalA = totalA * (1 + pr);
            iA++;
            String formattedDouble = String.format("%.4f", totalA);
            if (iA % 6 == 0) {
                System.out.println("Месяц " + iA + ", сумма накоплений равна " + formattedDouble);
            }
        }
        System.out.println("Задача 7");
        int reportingDay = 2;
        for ( i = 1; i <= 31; i++){
            if (reportingDay == 2 || reportingDay % i == 0){
                System.out.println(reportingDay);
                reportingDay = reportingDay + 7;
            }



        }




    }
}