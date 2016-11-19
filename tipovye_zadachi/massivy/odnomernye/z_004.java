package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 26.10.2016.
 */

// 4. Дана последовательность действительных чисел a1, a2, ..., an. Выяснить, будет ли она возрастающей.

public class z_004 {
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        if (a[0] < a[1])
            System.out.println("возраст.");
        else
            System.out.println("убыв.");
    }
}
