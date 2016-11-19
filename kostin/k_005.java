package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 01.11.2016.
 */

//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
//Если пользователь введёт не целое число, то сообщать ему об ошибке.

public class k_005 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        System.out.print("Введите целое число: ");
        if (a.hasNextInt())  // возвращает истинну если введено целое число
        {
            b = a.nextInt(); // считывает целое число с потока ввода и сохраняет в переменную
            if (b % 2 == 0)
                System.out.println("Вы ввели четное число");
            else
                System.out.println("Вы ввели нечетное число");
        }
        else
        {
            System.out.println("Вы ввели не целое число");
        }
    }
}