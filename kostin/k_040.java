package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 11.11.2016.
 */

//Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран.
// После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

public class k_040 {
    public static void main(String[] args) {
        int a = -99;
        int[][] da = new int[5][8];     //  Сначала строки, потом столбцы.
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int)(Math.random()*199) - 99;
                if(da[i][j] >= a)
                    a = da[i][j];
            }
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Значение максимального элемента массива: " + a);
    }
}
