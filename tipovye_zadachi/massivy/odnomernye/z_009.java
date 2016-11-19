package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 30.10.2016.
 */

//9. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class z_009 {
    public static void main(String[] args)
    {
        int[] a = {61, 155, -3, 1, 13, -21, 37, 0, 10, -7, 0, 15, 0, 0};
        int b = 0, c = 0, d = 0;
        for(int i = 0; i < a.length; i=i+1){
            if (a[i] < 0)
                b ++;
            if (a[i] > 0)
                c ++;
            if (a[i] == 0)
                d ++;
        }
        System.out.println("Кол-во отриц. эл-тов: " + b);
        System.out.println("Кол-во полож. эл-тов: " + c);
        System.out.println("Кол-во нулевых эл-тов: " + d);
    }
}