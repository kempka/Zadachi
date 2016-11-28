package ru.userboot.java2016.zadachi.shevchuk;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 25.11.2016.
 */

// Напишите программу - консольный калькулятор.
// Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения.
// Предложите пользователю ввести знак арифметической операции. Примите значение введенное пользователем и поместите его в строковую переменную sign.
// Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch. Выведите на экран результат выполнения арифметической операции.
// В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется,
// то отмените выполнение арифметической операции и уведомите об ошибке пользователя.

public class Z_02_002 {
    public static void main(String[] args) {
        int operand1 = 4, operand2 = 2;
        System.out.println("Ввведите знак арифметической операции");
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();

        switch (sign){
            case "+": System.out.println(operand1+operand2);
                break;
            case "-": System.out.println(operand1-operand2);
                break;
            case "*": System.out.println(operand1*operand2);
                break;
            case "/": System.out.println(operand2 != 0 ?operand1/operand2 : "Вы пытаетесь разделить на ноль!");
                break;
        }

    }
}
