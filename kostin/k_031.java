package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class k_031 {
    public static void main(String[] args) {
        int[] a = new int[4];
        int b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int)(Math.random()*89) + 10;
            b = a[0];
            c = a[1];
            d = a[2];
            e = a[3];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        if (b < c && c < d && d < e)
            System.out.println("Строго возрастающая последовательность!");
            System.out.println("Не строго возрастающая последовательность!");
    }
}
