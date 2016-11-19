package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.

public class k_014 {
    public static void main(String[] args) {
        for (int i = 2; i < 10000; i = i*2-1)
        System.out.println(i);
    }
}