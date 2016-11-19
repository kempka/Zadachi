package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 01.11.2016.
 */

//Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
//Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

public class k_006
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Введите первое число: ");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
            System.out.print("Введите второе число: ");
            if (scan.hasNextInt()){
                b = scan.nextInt();
            System.out.print(a + b);}
            else
            {
                System.out.println("Вы ввели не целое число");
            }
        }
        else
        {
            System.out.println("Вы ввели не целое число");
        }
    }
}