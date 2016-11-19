package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 30.10.2016.
 */

//8. Последовательность действительных чисел оканчивается нулем. Найти количество членов этой последовательности.

public class z_008 {
    public static void main(String[] args){
        double a[] = {7, 6.3, 5.4, -4.8, 3, 2.23, 1, 0};
        int b = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] * 10 % 10 == 0)
            b ++;
        }
        System.out.println(b);
    }
}