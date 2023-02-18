public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //task2
        System.out.println("Задача 2");
        for (int a = 10; a >= 0; a = a - 1) {
            System.out.println(a);
        }
        //task3
        System.out.println("Задача 3");
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println(b);
        }
        //task4
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }
        //task5
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }
        //task6
        System.out.println("Задача 6");
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
        //task7
        System.out.println("Задача 7");
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
        //task8
        System.out.println("Задача 8");
        int deposit = 29000;
        int sum = 0;
        for (int p = 0; p <= 12; p++) {
            sum = sum + deposit;
            System.out.println("Месяц " + p + ": сумма накоплений равна " + sum);
        }
        //task9
        System.out.println("Задача 9");
        int dep = 29000;
        int total = 0;
        for (int p = 0; p <= 12; p++) {
            total = total + total / 100;
            total = total + dep;
            System.out.println("Месяц " + p + ": сумма накоплений равна " + total);
        }
        //task10
        System.out.println("Задача 10");
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
            }
        }
    }