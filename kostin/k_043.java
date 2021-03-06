package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 11.11.2016.
 */

//Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
// чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны повторяться.
// В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения
// (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
// При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

public class k_043 {
    public static void main(String[] args) {
        int[][] m = new int[15][2];         //  В этом массиве будет окончательное решение.
        int[][] da = new int[64][2];        //  В этом массиве будут все возможные варианты умножения от 2 до 9.
        int a = 2, b = 2;
        int c = 0, d = 0, e = 0;        // Счётчики.
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                if (j == 0) {
                    da[i][j] = a;
                } else if (j == 1) {
                    da[i][j] = b;
                }
            }
            b++;
            if (b == 10) {
                a++;
                b = 2;
            }
        }
        //  Начнём заполнять окончательный массив числами соответствующими условию.
        for (int i = 0; i < 100; i++) {
            c = (int) (Math.random() * 64);
            for (int j = 0; j < 15; j++) {
                if (da[c][0] == m[d][0] && da[c][1] == m[d][1]) {
                    c = (int) (Math.random() * 64);
                    j = -1;
                }
                if (da[c][1] == m[d][0] && da[c][0] == m[d][1]) {
                    c = (int) (Math.random() * 64);
                    j = -1;
                }
            }
            m[e][0] = da[c][0];
            m[e][1] = da[c][1];
            e++;
            if (e == 15)
                break;
        }
        //  Цикл перебора массива m в целях окончательного форматирования.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
                if (j == 0){
                System.out.print("x ");}
            }
            System.out.println(); // Переходим на следующую строку.
        }
    }
}
