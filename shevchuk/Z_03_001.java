package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 25.11.2016.
 */

// Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
// Напишите программу, которая будет выполнять проверку – является ли указанное число степенью двойки или нет.

public class Z_03_001 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        double var = scanner.nextDouble();
        var = Math.sqrt(var);
        if (var % 2 == 0.0)
            System.out.println("Введенное число является степенью двойки");
        else System.out.println("Введенное число НЕ является степенью двойки");
    }
}
