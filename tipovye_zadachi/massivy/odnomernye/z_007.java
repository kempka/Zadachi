package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 30.10.2016.
 */
//7. Дана последовательность действительных чисел a1, a2, ..., an.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class z_007 {
    public static void main(String[] args){
        int z = 12;
        int b = 0;
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 5; i <= 20; i++)
            if(i > z){
                a.add(z);
                b ++;}
            else
                a.add(i);
        System.out.println(a);
        System.out.println("количество замен: " + b);
    }
}