package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

public class k_032 {
    public static void main(String[] args)
    {
        int[] m = new int[20];
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.print(a+" ");
        for (int i = 1; i <= m.length - 1; i++) {
            m[i] = a;
            System.out.print(m[i]+" ");
            a = b;                       // начало перехода к циклу генерации Фибоначчи.
            b = c;
            c = a + b;
        }
    }
}
