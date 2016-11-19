package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 04.11.2016.
 */

//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).

public class k_021 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        int a;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        int c;
        while(a > 0) {                    // Цикл разложения числа на цифры
            c = a % 10;
            b += c;                     // Поочередное сложение
            a = a / 10;
        }
        System.out.println(b);
    }
}