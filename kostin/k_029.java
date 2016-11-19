package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 07.11.2016.
 */

//Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
public class k_029 {
    public static void main(String[] args){
        int c;
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 1; i <= 8; i++){
            c = (int)(Math.random()*10) + 1;
            a.add(c);
            if (i%2==0)
            {c=0;}
            b.add(c);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
