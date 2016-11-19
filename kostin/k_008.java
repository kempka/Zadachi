package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 01.11.2016.
 */

//Создать программу, которая будет проверять, является ли слово из пяти букв, введённое пользователем, палиндромом (примеры: «комок», «ротор»).
//Если введено слово не из 5 букв, то сообщать об ошибке. Программа должна нормально обрабатывать слово, даже если в нём использованы символы разного регистра.
//Например, слова «Комок» или «РОТОР» следует также считать палиндромами.

public class k_008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово из пяти букв:");
        String a = scan.nextLine();
        String c = a.toLowerCase(); // преобразует все буквы введенного слова в маленькие.
        if (c.length() == 5){
            if (c.charAt(0) == c.charAt(4) && c.charAt(1) == c.charAt(3))   // c.charAt(3) - возвращает 4-й индекс слова "с" и т.п.
                System.out.println("Это палиндром!");
            else
                System.out.println("Это НЕ палиндром!");
        }
        else
            System.out.println("Слово не соответствует условию!");
    }
}