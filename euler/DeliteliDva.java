package ru.userboot.java2016.zadachi.euler;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

public class DeliteliDva
{   // Аннотация @SupressWarnings указывает на то, что именованное предупреждение (warning) компилятора
    //должно быть подавлено в аннотируемом элементе (и во всех содержащихся в нём программных элементах).
    // У меня возникали предупреждения из-за того, что я не использую генерики, с использованием оных
    //возникала ошибка в возвращении (return a;).

    @SuppressWarnings({"unchecked", "unused"})
    private static List deliteli(){
        List a = new ArrayList();
        int n = 100;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                a.add(i);
        }
        return a;
    }
    private static void printMassiv(List a){
        System.out.print(a);
    }
    public static void main(String[] args){
        List array = deliteli();
        printMassiv(array);
    }
}
