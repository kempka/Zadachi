package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!
/**
 * Created by UserBoot on 22.11.2016.
 */

// Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
// Выполните и рассчитайте результат следующих операций для этих переменных:
//
// x += y - x++ * z;
// z = --x – y * 5;
// y /= x + 5 % z;
// z = x++ + y * 5;
// x = y - x++ * z;

// инструкция:
// int k = 3;
//  ++k; // k = 4
//  --k; // k = 2
// int s = 3;
//  s++; // s = s + 1, s = 4
//  s--; // s = s - 1, s = 2

public class Z_01_001 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
        System.out.printf("1-е уравнение = %s", x += y - x++ * z);
        System.out.println();
        x = 10;
        y = 12;
        z = 3;
        System.out.printf("2-е уравнение = %s", z = --x - y * 5);
        System.out.println();
        x = 10;
        y = 12;
        z = 3;
        System.out.printf("3-е уравнение = %s", y /= x + 5 % z);
        System.out.println();
        x = 10;
        y = 12;
        z = 3;
        System.out.printf("4-е уравнение = %s", z = x++ + y * 5);
        System.out.println();
        x = 10;
        y = 12;
        z = 3;
        System.out.printf("5-е уравнение = %s", x = y - x++ * z);
        System.out.println();
    }
}
