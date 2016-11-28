package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 22.11.2016.
 */
// Напишите программу расчета объема - V и площади поверхности -S цилиндра.
//        Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR 2 h
//        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR 2 + 2πR 2 = 2πR(R+h)
//        Результаты расчетов выведите на экран.

public class Z_01_004 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r = 12, h = 30;
        double v = pi * r * 2 * h;
        double s = 2 * pi * r * (r + h);
        System.out.println("Объем цилиндра = " + v);
        System.out.println("Площадь цилиндра = " + s);
    }
}
