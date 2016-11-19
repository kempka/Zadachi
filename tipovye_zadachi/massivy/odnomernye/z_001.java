package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 25.10.2016.
 */

/*1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному k.*/

public class z_001
{
    public static void main (String[] args)
    {
        int[] a = new int[101];
        int b = 0;
        for(int i = 0; i < a.length; i = i + 5)
        {
            b = b + i;
        }
        System.out.println(b);
    }
}
