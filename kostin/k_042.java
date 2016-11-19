package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 11.11.2016.
 */

//Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран.
// Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
// При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
// Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.

public class k_042 {
    public static void main(String[] args) {
        int a = 0, c = 0;
        int[] d = new int[6];       // В этом массиве будем хранить максимальные значения строк массива da.
        int[] b = new int[6];       // В этом массиве будем хранить индексы максимальныч значений строк массива da.
        int[][] da = new int[6][7];     //  Сначала строки, потом столбцы.
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int)(Math.random()*10);}
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                if(da[i][j] >= a){
                    a = da[i][j];
                    c = j;}
                System.out.print(da[i][j] + "\t");
            }
            d[i] = a;
            b[i] = c;
            a = 0;
            System.out.println(); // Переходим на следующую строку.
        }
        System.out.println();
//        for(int i = 0; i < d.length; i++) {
//            System.out.print(d[i] + "\t");
//        }
//        System.out.println();
//        for(int i = 0; i < b.length; i++) {
//                System.out.print(b[i] + "\t");
//        }
//        System.out.println();
//        System.out.println();
        //  Перебираем массив с заменой первого столбца на максимальные значения соответствующих строк, а
        //  значения с нолевыми индексами ставим на места максимальных.
        for(int i = 0; i<da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                if (j == 0) {
                    System.out.print(da[i][b[i]] + "\t");}
                if (j == b[i] && b[i] != 0) {
                    System.out.print(da[i][0] + "\t");}
                else if (j != 0 && j != b[i]){
                System.out.print(da[i][j] + "\t");}
            }
            System.out.println(); // Переходим на следующую строку.
        }
    }
}
