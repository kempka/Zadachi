package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 30.10.2016.
 */

//В три переменные a, b и c записаны три вещественных числа.
// Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.

public class k_001 {
    public static void main(String[] args) {
        double a = 2.3, b = 17.2, c = -8.15;
        double d = Math.sqrt(b) - (4 * a * c);
        double x1, x2;
        System.out.println("дискриминант = " + d);
        if (d < 0)
            System.out.println("Корней нет");
        x1 = (-b + Math.sqrt(d)) / 2 * a;
        x2 = (-b - Math.sqrt(d)) / 2 * a;
        System.out.println(x1);
        System.out.println(x2);
    }
}
