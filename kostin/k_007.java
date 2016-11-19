package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by UserBoot on 01.11.2016.
 */

//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.

public class k_007 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List <Double> d = new ArrayList <Double>();
        // ВВОДИТЬ НУЖНО ЧЕРЕЗ ЗАПЯТУЮ, например: 1,5; 13,07 и т.п. Никак не - 2.7; 13.8.
        System.out.print("Введите первое вещественное число, через запятую: ");
        if (scan.hasNextDouble()){       // если введено вещественное число, то - истина.
            d.add(Math.abs(scan.nextDouble()));
            System.out.print("Введите второе вещественное число, через запятую: ");}
        if (scan.hasNextDouble()){
            d.add(Math.abs(scan.nextDouble()));
            System.out.print("Введите третье вещественное число, через запятую: ");}
        if (scan.hasNextDouble()){
            d.add(Math.abs(scan.nextDouble()));
            System.out.println(d);
            if (d.get(0) < d.get(1) && d.get(0) < d.get(2)){
                System.out.println(d.get(0));}
            if (d.get(1) < d.get(0) && d.get(1) < d.get(2)){
                System.out.println(d.get(1));}
            if (d.get(2) < d.get(0) && d.get(2) < d.get(1)){
                System.out.println(d.get(2));}}
        else
            System.out.println("Вы ввели не число");
        }
    }