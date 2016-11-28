package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 25.11.2016.
 */

// Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток [0; 14] [15; 35] [36; 50][51; 100].
// Если да, то укажите, в какой именно промежуток. Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков,
// то выводится соответствующее сообщение.

public class Z_02_003 {
    public static void main(String[] args) {

        System.out.println("Введите целое число от 0 до 100");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        if (var >= 0 && var <= 100) {
            if (var >= 0 && var <= 14)
                System.out.println("Ваше число входит в промежуток [0; 14]");
            if (var >= 15 && var <= 35)
                System.out.println("Ваше число входит в промежуток [15; 35]");
            if (var >= 36 && var <= 50)
                System.out.println("Ваше число входит в промежуток [36; 50]");
            if (var >= 51 && var <= 10)
                System.out.println("Ваше число входит в промежуток [51; 100]");
        } else {
            System.out.println("Ваше число не входит в промежуток");
        }
    }
}
