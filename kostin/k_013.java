package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class k_013 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i > 0; i = i * 2){
            System.out.println(i);
            a++;
            if (a == 20)
                break;}
    }
}