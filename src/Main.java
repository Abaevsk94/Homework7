public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17 * population / 1000;
        int mortality = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + fertility;
            population = population - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15_000;
        int month = 0;
        double percent = 1.07;
        while (sum <= 12_000_000) {
            month++;
            sum *= percent;
            System.out.printf("Месяц %d - накопил %d \n", month, sum);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15_000;
        double percent = 1.07;
        for (int i = 1; sum <= 12_000_000; i++) {
            sum *= percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d - накопил %d \n", i, sum);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15_000;
        double interestRate = 0.07;
        int halfYear = 6;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum;
            sum *= 1 + interestRate * halfYear;
            System.out.printf("Месяц %d - накопил %d \n", i, sum - sumBefore);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int day = 2; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2022;
        int minYear = currentYear - 200;
        int maxYear = currentYear + 100;
        for (int i = minYear; i <= maxYear; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}