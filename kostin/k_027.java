package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 07.11.2016.
 */

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

public class k_027 {
    public static void main(String[] args) {
        int[] a = new int [1000];
        for(int i = 1; i <= 999; i += 2)
        {
            a[i] = i;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i = 999; i > 0; i -= 2)
        {
            System.out.print(a[i]+" ");
        }
    }
}