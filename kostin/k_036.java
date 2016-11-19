package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 09.11.2016.
 */

//Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
// размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить
// и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.

public class k_036 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите чётное число: ");
        int b = a.nextInt();
        int c = 0, d = 0;
        int e = -1;      //  счетчик
        if (b % 2 != 0 || b < 0) {
            System.out.println("Вы ввели некорректное число!");
            System.out.println("Повторите попытку.");
        } else {
            int m[] = new int[b];
            for (int i = 0; i < m.length; i++) {
                m[i] = (int) (Math.random() * 11) - 5;
            }
            for (int i = 0; i < m.length; i++) {
                e++;
                if (e < b / 2) {
                    c += Math.abs(m[i]);
                } else
                    d += Math.abs(m[i]);
                System.out.print(m[i] + "  ");
            }
        }
        System.out.println();
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        if (c > d) {
            System.out.println("Левая половина больше");
        } else if (c < d) {
            System.out.println("Правая половина больше");
        } else System.out.println("Обе половины равны");
    }
}