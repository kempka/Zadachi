package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 28.10.2016.
 */

//5. Дана последовательность натуральных чисел a1, a2, ..., an. Создать массив из четных чисел этой последовательности.
// Если таких чисел нет, то вывести сообщение об этом факте.

public class z_005
{
    public static void main(String[] args)
    {
        int[] a = {1, 5, 3, 7, 13, 21, 37};
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                b.add(a[i]);
            }
        }
        if (b.size() == 0)              //  b.size() - число элементов списка.
            System.out.println("нет");
        else
            System.out.println(b);
    }
}