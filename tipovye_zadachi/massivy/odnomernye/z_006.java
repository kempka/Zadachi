package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 30.10.2016.
 */

//6. Дана последовательность чисел a1, a2, ..., an. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class z_006 {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 5; i < 20; i++) 
             a.add(i);
        System.out.println(a.size());
    }
}
