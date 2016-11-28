package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 25.11.2016.
 */

// Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде. Требуется, чтобы пользователь вводил слово на русском языке,
// а программа давала ему перевод этого слова на английском языке. Если пользователь ввел слово, для которого отсутствует перевод,
// то следует вывести сообщение, что такого слова нет.

public class Z_02_001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String rus = scanner.nextLine();

        switch (rus)
        {
            case "гроза": System.out.println("thunderstorm");
                break;
            case "туман": System.out.println("fog");
                break;
            case "жара": System.out.println("heat");
                break;
            case "ветер": System.out.println("cloudy");
                break;
            case "солнечно": System.out.println("sunny");
                break;
            case "дождь": System.out.println("rain");
                break;
            case "ветренно": System.out.println("windy");
                break;
            case "тепло": System.out.println("warmly");
                break;
            case "холодно": System.out.println("coldly");
                break;
            default:
                System.out.println("Такого слова нет в словаре!");
                break;
        }

    }
}
