package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 26.10.2016.
 */

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class z_002
{
    public static void main(String[] args)
    {
        int[] a = {9, 6, 0, 59, 0, 0, 12, 1, 7, 0};
        List <Integer> b = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                b.add(i);
        }
        System.out.print(b);
    }
}
