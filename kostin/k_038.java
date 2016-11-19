package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 10.11.2016.
 */

//Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

public class k_038 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите натуральное число больше 3: ");
        if (a.hasNextInt()) {
            int n = a.nextInt();
            if (n > 3){
            int m[] = new int[n];
            for (int i = 0; i < m.length; i++) {
                m[i] = (int) (Math.random() * (n + 1));
                System.out.print(m[i]+"  ");
            }
                System.out.println();
                for (int i = 0; i < m.length; i++) {
                    if (m[i] % 2 == 0){
                    System.out.print(m[i]+"  ");}
                }

            }else
                System.out.println("Ваше число меньше, либо равно 3!");
            }
        else if (a.hasNextDouble()){
            System.out.println("Вы ввели дробное число!");}
        else
            System.out.println("Вы ввели некорректное число!");
    }
}
