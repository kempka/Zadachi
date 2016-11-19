package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import static ru.userboot.java2016.zadachi.kostin.k_044.sluchaynoeCeloe;

/**
 * Created by UserBoot on 14.11.2016.
 */

// Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода из
// предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.

public class k_045 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            msv();
            System.out.println();
        }
    }
    public static void msv(){
        for (int j = 0; j < 10; j++){
            System.out.print(sluchaynoeCeloe() + ", ");
        }
    }

}
