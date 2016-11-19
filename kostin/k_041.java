package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 11.11.2016.
 */

//Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
// Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.

public class k_041 {
    public static void main(String[] args) {
        int a = 1;
        int[] d = new int[7];       // В этом массиве будем хранить произведения строк массива da.
        int[][] da = new int[7][4];     //  Сначала строки, потом столбцы.
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int)(Math.random()*11)-5;
                a *= Math.abs(da[i][j]);}
            d[i] = a;
            a = 1;
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку.
        }
        for(int i = 0; i < d.length; i++) {
            if(d[i] >= a){      //  Выясним, какой элемент наибольший.
                a = d[i];
            }
        }
        for(int i = 0; i < d.length; i++) {
            if(d[i] == a){      //  Выявим первый максимальный элемент.
                System.out.println("Индекс строки с наибольшим по модулю произведением элементов: " + i);}
        }
    }
}