package ru.userboot.java2016.zadachi.euler;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/*Простые делители числа 13195 - это 5, 7, 13 и 29.
Каков самый большой делитель числа 600851475143, являющийся простым числом?*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeliteliTri
{
    public static void main(String[] args)
    {
        String a = "Введите целое число от 0 до 2147483646, чтобы узнать его делители.";
        System.out.println(a);
        List<Integer> b = new ArrayList<Integer>(); // Создаем пустой список: b.
        Scanner scanner = new Scanner(System.in);   // Объявляем систему ввода с клавиатуры.
        int n = scanner.nextInt();  // В эту переменную будут помещаться данные с клавиатуры.
        for (int i = 2; i < n; i++) // Заполняем список с условием ниже.
        {
            if (n % i == 0)
                b.add(i);
        }
        Collections.reverse(b); // Меняем нумерацию с конца.
        System.out.println("Все делители числа "+ n + " будут:" +b);
        int h = 0;
        int c = b.get(h);
        int e = c - 1;
        int z = 0;
        while (e >= 2) {    // Перебираем список с условием ниже.
            if (c % e == 0)
            {
                h = h + 1;
                c = b.get(h);
                e = c;
            }
            else
            {
                z = c;
            }
            e = e - 1;
        }
        System.out.println("Из них наибольший, являющийся простым числом - это: " + z);
    }
}