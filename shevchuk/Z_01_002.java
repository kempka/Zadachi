package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!
/**
 * Created by UserBoot on 22.11.2016.
 */

// Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
// С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного отображения результата?

public class Z_01_002 {
    public static void main(String[] args) {
        int a = 25, b = 12, c = 31;
        double d = (double) (a + b + c) / 3;
        System.out.println(d);
    }
}
