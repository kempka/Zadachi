package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Создайте программу, выводящую на экран 12 первых элементов последовательности 2an-2–2, где a1=3 и a2=2.

public class k_019 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(3);
        for (int i = 2; i < 100; i = i - 2){
            System.out.println(i);
            a++;
            if (a == 11)
                break;}
    }
}