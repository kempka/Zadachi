package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 03.11.2016.
 */

//Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
// Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
// Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].

public class k_018
{
    public static void main(String[] args)
    {
        System.out.println("Введите натуральное число: ");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n == 2)
        System.out.println("Это простое число!");
        if (n >= 2) {
        for (int i = 2; i < n; i++)
        if (n % i == 0) {
            System.out.println("Это не простое число!");
            break;}
        else {
            System.out.println("Это простое число!");
            break;}
        }
        else
        System.out.println("Вы ввели не корректное число");
    }
}