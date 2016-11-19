package ru.userboot.java2016.zadachi.euler;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/*Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух трёхзначных чисел.*/

import java.util.ArrayList;
import java.util.List;

public class Palindrom
{
    public static void main(String[] args)
    {
        int o = 0;
        int n = 1;
        int k = 100 + o;
        int m = 100 + n;
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        List<Integer> z = new ArrayList<Integer>();
        while (k <= 999)
        {
            int p = k * m;
            int q = p % 10;
            int r = p / 100000;
            int t = p % 100 / 10;
            int u = p / 10000 % 10;
            int v = p / 100 % 10;
            int w = p % 10000 / 1000;
            if (p > 100000)
            {
                if (r == q)
                {
                    if (t == u) {
                        if (v == w) {
                            if (r == 9) {
                                x.add(k);
                                y.add(m);
                                z.add(p);
                            }
                        }
                    }
                }
            }
            n += 1;
            m = 100 + n;
            if (m == 1000) {
                n = 0;
                o += 1;
                k = 100 + o;
            }
        }
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    }
}
