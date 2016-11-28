package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by UserBoot on 27.11.2016.
 */
// Напишите программу, которая будет выполнять конвертирование валют.
//        Пользователь вводит:
//        сумму денег в определенной валюте.
//        курс для конвертации в другую валюту.
//        Организуйте вывод результата операции конвертирования валюты на экран на 27.11.2016.

public class Z_05_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, какая валюта у вас на руках: RUR, USD, EUR.");
        String валютаНаРуках = scanner.next();
        валютаНаРуках = валютаНаРуках.toUpperCase();

        System.out.println("Введите сумму");
        double количествоДенег = scanner.nextDouble();

        System.out.println("Введите, в какую валюту конвертировать: RUR, USD, EUR.");
        String валютаПосле = scanner.next();
        валютаПосле = валютаПосле.toUpperCase();

        if (Objects.equals(валютаНаРуках, "RUR") && Objects.equals(валютаПосле, "USD")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег / 64.62, валютаПосле);
        }
        if (Objects.equals(валютаНаРуках, "RUR") && Objects.equals(валютаПосле, "EUR")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег / 68.44, валютаПосле);
        }
        if (Objects.equals(валютаНаРуках, "USD") && Objects.equals(валютаПосле, "RUR")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег * 64.62, валютаПосле);
        }
        if (Objects.equals(валютаНаРуках, "EUR") && Objects.equals(валютаПосле, "RUR")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег * 68.44, валютаПосле);
        }
        if (Objects.equals(валютаНаРуках, "EUR") && Objects.equals(валютаПосле, "USD")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег * 0.94, валютаПосле);
        }
        if (Objects.equals(валютаНаРуках, "USD") && Objects.equals(валютаПосле, "EUR")) {
            System.out.printf("%s %s = %s %s%n", количествоДенег, валютаНаРуках, количествоДенег * 1.06, валютаПосле);
        }
    }
}
