package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 22.11.2016.
 */

// Создайте константу с именем -pi (число ? «пи»), создайте переменную радиус с именем – r.
// Используя формулу (pi)R**2 , вычислите площадь круга и выведите результат на экран.

public class Z_01_003 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r = 12;
        double s = pi * Math.pow(r, 2);
        System.out.println("Площадь круга = " + s);
    }
}
