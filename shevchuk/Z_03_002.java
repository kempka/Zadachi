package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by Userboot on 25.11.2016.
 */

// Используя теорему Де Моргана, преобразуйте исходное выражение a | b, в эквивалентное выражение.

public class Z_03_002 {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.printf("%s || %s = %s", a, b, a || b);
        System.out.println();
        System.out.printf("!(!%s && !%s) = %s", a, b, !(!a & !b));
    }
}
