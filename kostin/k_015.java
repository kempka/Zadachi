package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 03.11.2016.
 */

//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.

public class k_015 {
    public static void main(String[] args) {
        for (int i = -166; i < 100; i = i*2+200)
            if (i > -100){
            System.out.println(i);}
    }
}