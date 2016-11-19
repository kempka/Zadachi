package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

public class k_033 {
    public static void main(String[] args) {
        int[] a = new int[12];
        int b = -15, c = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = (int)(Math.random()*31) - 15;
            if (a[i] > b){
                b = a[i];
                c = i;}
        System.out.print(a[i]+" ");}
        System.out.println();
        System.out.println("Максимальным будет: "+b+", индекс его последнего вхождения в массив: "+c);
    }
}
