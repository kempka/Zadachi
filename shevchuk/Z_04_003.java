package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 25.11.2016.
 */

// Используя циклы и метод:
// System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
// Выведите на экран:
// · прямоугольник
// · прямоугольный треугольник
// · равносторонний треугольник
// · ромб

public class Z_04_003 {
    public static void main(String[] args) {
        int x = 15, y = 15, z = 1;
        // Прямоугольник.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Прямоугольный треугольник.
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int buf = y;
        // равносторонний треугольник
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            y -= 1;
            z += 2;
            System.out.println();
        }

        // Ромб.
        for (int i = 0; i < (x + x + 1); i++) {
            if (i < x) {
                for (int j = 0; j < buf; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < z; k++) {
                    System.out.print("*");
                }
                buf -= 1;
                z += 2;
                System.out.println();
            } else {
                for (int j = 0; j < buf; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < z; k++) {
                    System.out.print("*");
                }
                buf += 1;
                z -= 2;
                System.out.println();
            }
        }
    }
}
