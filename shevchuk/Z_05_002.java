package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by UserBoot on 27.11.2016.
 */

// Создайте четыре метода для выполнения арифметических операций, с именами: Add – сложение, Sub – вычитание, Mul – умножение, Div – деление.
// Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической операции соответствующей имени метода.
// Метод деления Div, должен выполнять проверку попытки деления на ноль.
// Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак арифметической операции, для выполнения вычислений.

public class Z_05_002 {
    public static void main(String[] args) {
        double a, b;
        String оператор;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        a = scanner.nextDouble();
        System.out.println("Введите арифметический оператор");
        оператор = scanner.next();

        System.out.println("Введите следующее число");
        b = scanner.nextDouble();
        if (b == 0 && Objects.equals(оператор, "/")) {
            System.out.println("Вы пытаетесь разделить на ноль!");
        }else {

            switch (оператор) {
            case "+": {
                System.out.println("Результат вычисления " + a + " " + оператор + " " + b + " = " + сложение(a, b));
                break;
            }
            case "-": {
                System.out.println("Результат вычисления " + a + " " + оператор + " " + b + " = " + вычитание(a, b));
                break;
            }
            case "*": {
                System.out.println("Результат вычисления " + a + " " + оператор + " " + b + " = " + умножение(a, b));
                break;
            }
            case "/": {
                System.out.println("Результат вычисления " + a + " " + оператор + " " + b + " = " + деление(a, b));
                break;
            }

        }}
    }

    private static double сложение(double a, double b) {
        return a + b;
    }

    private static double вычитание(double a, double b) {
        return a - b;
    }

    private static double умножение(double a, double b) {
        return a * b;

    }

    private static double деление(double a, double b) {
            return a / b;

    }
}
