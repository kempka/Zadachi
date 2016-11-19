package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Выведите на экран первые 11 членов последовательности Фибоначчи.
// Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

public class k_020 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;
        int d = 0;          //   Счётчик!
        System.out.println(1);
        do {
            System.out.println(c);
            a = b;                       // начало перехода к циклу генерации Фибоначчи.
            b = c;
            c = a + b;
            d++;
        }
        while (d <= 9);
    }
}