package ru.userboot.java2016.zadachi.euler;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/*Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Найдите сумму всех четных элементов ряда Фибоначчи, не превышающую четыре миллиона.*/

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = 0;
        while (d <= 4000000)               // пока d меньше, либо = 4000000 цикл будет продолжаться.
        {
            if (d + a > 4000000)
                System.out.print(d);
            if (a % 2 == 0)              // если a разделить по модулю на 2 и в ответе получить: 0, то - чётное число.
                d = d + a;
            if (b % 2 == 0)
                d = d + b;
            if (c % 2 == 0)
                d = d + c;
            a = b;                       // начало перехода к циклу генерации Фибоначчи.
            b = c;
            c = a + b;
        }
    }
}
