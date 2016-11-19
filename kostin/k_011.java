package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class k_011 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i > 0; i = i + 2){
            System.out.println(i);
            a++;
            if (a == 55)
                break;}
    }
}