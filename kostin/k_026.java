package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 07.11.2016.
 */

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
// отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.
//        2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20

public class k_026 {
    public static void main(String[] args) {
        int k = 20;                     //  переменная длины массива
        int[] a = new int [k + 2];      //  почему-то к длине нужно прибавить "2"
        for(int i = 2; i <= k; i += 2){
            a[i] = i;
            System.out.print(a[i] +" ");
        }
        System.out.println();
        int[] b = new int [k + 2];
        for(int i = 2; i <= k; i += 2){
            b[i] = i;
            System.out.println(b[i] +" ");
        }
    }
}
