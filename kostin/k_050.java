package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 15.11.2016.
 */

//Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элементы последовательности Фибоначчи для вычисления пятнадцатого элемента.

    // НЕ МОЁ РЕШЕНИЕ, спасибо lillane!!!
public class k_050 {
    static int i = 0;
    public static void main(String[] args) {

        int n = 15;
        // Формула Фибоначи: Fn= Fn-1+Fn-2.
        fib(n);
        System.out.println(i);
    }

    public static int fib (int n){
        if(n == 4){
            i++;
        }
        if(n<2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
