package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 05.11.2016.
 */

//Электронные часы показывают время в формате от 00:00 до 23:59.
// Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
// что справа от двоеточия (например, 02:20, 11:11 или 15:51).

public class k_024 {
    public static void main(String[] args) {
        int palindrom = 0;
        for (int a1 = 0; a1 <= 2; a1++) {
            for (int a2 = 0; a2 <= 3; a2++) {
                for (int a3 = 0; a3 <= 5; a3++) {
                    for (int a4 = 0; a4 <= 9; a4++) {
                        int d = raz(a1, a2, a3, a4);
                        if (d == 1)
                            palindrom++;
                    }
                }
            }
        }
        System.out.println("Условленная комбинация встречается " + palindrom + " раз.");
    }
    private static int raz(int a1, int a2, int a3, int a4){
        int b;
        if (a1 == a4 && a2 == a3){
            b = 1;
        }else b = 0;
        return b;
    }
}