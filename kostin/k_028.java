package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 07.11.2016.
 */

//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

public class k_028 {
    public static void main(String[] args){
        int[] a = new int[15];
        int b = 0;
        for (int i = 0; i <= a.length-1; i++){
            a[i] = (int)(Math.random()*9);
                if (i % 2 == 0){
                    b++;}
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Чётных элементов: " + b);
    }
}
