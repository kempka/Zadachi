package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 27.11.2016.
 */

//Создайте метод с именем Calculate, который принимает в качестве параметров три целочисленных аргумента и выводит на экран среднее арифметическое значений аргументов.

public class Z_05_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double d;
        System.out.println("Введите три целых числа через \"Enter\"");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = среднее(a, b, c);
        System.out.println(d);
        System.out.printf("Среднее арифметическое чисел %d, %d, %d = %f", a, b, c, d);
    }

    private static double среднее(int a, int b, int c) {
        return (double)(a + b + c) / 3;
    }
}
