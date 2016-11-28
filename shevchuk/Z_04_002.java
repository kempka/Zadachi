package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 25.11.2016.
 */

// Дано два числа A и B (A<B) выведите суму всех чисел расположенных между данными числами на экран.
// Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.

public class Z_04_002 {
    public static void main(String[] args) {
        int a = 24, b = 33;
        int sum = 0;
        System.out.print("Нечетные значения: ");
        for (int i = a + 1; i < b; i++) {
            sum += i;
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.print("Сумма: " + sum);
    }
}
