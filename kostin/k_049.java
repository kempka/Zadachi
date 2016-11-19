package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import static ru.userboot.java2016.zadachi.kostin.k_048.fib;

/**
 * Created by UserBoot on 15.11.2016.
 */

// Создайте гибридный метод, для небольших n вычисляющий n-ое число Фибоначчи с помощью рекурсии, а для значений,
// превышающих выясненное вами в предыдущей задаче пороговое n, вычисляющий n-ое число Фибоначчи с помощью
// итерационного алгоритма (цикла, в рамках которого будут сохраняться значения двух предыдущих элементов последовательности).

public class k_049 {
    public static void main(String[] args){
        long massiv [] = new long[47];
        long n, m;
        long c;
        for (int i = 1; i < massiv.length; i++){
            n = i;
            massiv[i] = fib(n);
            System.out.print(massiv[i] + ", ");
        }
        m = massiv[massiv.length - 2];
        n = massiv[massiv.length - 1];
        for (int i = 1; i < massiv.length; i++) {
            c = m + n;
            m = n;
            n = c;
            massiv[i] = c;
            System.out.print(massiv[i] + ", ");
            if (massiv[i] >= Integer.MAX_VALUE){break;}
        }
    }
}
