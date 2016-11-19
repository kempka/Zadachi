package ru.userboot.java2016.zadachi.euler;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        double x = 0.0; // абсцисса центра
        double y = 0.0; // ордината центра
        double r = 1.0; // радиус

        System.out.print("Введите радиус окружности: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        System.out.println("Введите координаты центра окружности: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

    }
}

