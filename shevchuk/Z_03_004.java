package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 25.11.2016.
 */

// Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
// Выполните и рассчитайте результат следующих операций для этих переменных:
//
// x += y >> x++ * z;
// z = ++x & y * 5;
// y /= x + 5 | z;
// z = x++ & y * 5;
// x = y << x++ ^ z;

public class Z_03_004 {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;
        z = ++x & y * 5;
        System.out.println(x);
        System.out.println(z);

        y /= x + 5 | z;
        z = x++ & y * 5;
        x = y << x++ ^ z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
