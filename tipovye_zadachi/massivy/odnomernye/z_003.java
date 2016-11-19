package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 26.10.2016.
 */

//3. Дана последовательность целых чисел a1, a2, ..., an. Выяснить, какое число встречается раньше – положительное или отрицательное.

public class z_003
{
    public static void main(String[] args)
    {
        int[] a = {-9, 6, 0, -59};
        if (a[0] < 0)
            System.out.println("отрицательное");
        else
            System.out.println("положительное");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+", ");
        }
    }
}
