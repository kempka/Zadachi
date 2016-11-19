package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

public class k_030 {
    public static void main(String[] args){
        int[] a = new int[5];
        double b = 0, c = 0;
        for (int i = 0; i <= a.length-1; i++){
            a[i] = (int)(Math.random()*5);
                b = (b + a[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <= a.length-1; i++){
            a[i] = (int)(Math.random()*5);
            c = (c + a[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое первого массива: " + b/2);
        System.out.println("Среднее арифметическое второго массива: " + c/2);
        if (b > c)
            System.out.println("Среднее арифметическое первого массива больше");
        else if (b < c)
            System.out.println("Среднее арифметическое второго массива больше");
        else
            System.out.println("Средние арифметические равны");
    }
}
