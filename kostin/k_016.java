package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 03.11.2016.
 */

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

public class k_016 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        int n;
        int b = 1;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n == 0)
            System.out.println("Факториал 0(нуля) равен 1");
        else {
        for (int i = 1; i <= n; i++)
            b = b * i;
            System.out.println("Факториал числа " + n + " равен " + b);}
    }
}