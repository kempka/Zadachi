package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class k_010 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i = i + 3)
            System.out.println(i);
    }
}