package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class k_035 {
    public static void main(String[] args) {
        int[] m = new int[11];
        int a = -1, b = 0, c = 1;
        for (int i = 0; i < m.length; i++) {
            m[i] = (int)(Math.random()*3) - 1;
            System.out.print(m[i]+" ");
            if (m[i] == -1)
                a++;
            else if (m[i] == 0)
                b++;
            else c++;
        }
        System.out.println();
        if (a > b && a > c)
        System.out.println("Чаще всего встречается: -1");
        else if (b > a && b > c)
        System.out.println("Чаще всего встречается: 0");
        else if (c > a && c > b)
        System.out.println("Чаще всего встречается: 1");

    }
}
