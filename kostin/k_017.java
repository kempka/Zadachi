package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 03.11.2016.
 */

//Выведите на экран все чётные делители натурального числа, введённого пользователем с клавиатуры.

public class k_017 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        int n, a;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n > 1) {
            for (int i = 1; i < n; i++)
            if (n % i == 0){
                b = i;
            if (b % 2 == 0) {
                a = b;
                System.out.println(a);}}
        }
        else
        System.out.println("Вы ввели не корректное число");
    }
}