package ru.userboot.java2016.zadachi.euler;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

public class Deliteli
{
    private static int[] massiv()
    {   // в этом методе создаем массив с нужными параметрами.
        int n = 10;
        int[] a = new int[n];
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            a[i] = i;
        }
        return a;
    }
    private static void printMassiv(int[] a)
    {   // в этом методе перебираем c нужными параметрами массив "a" и выводим его.
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
            System.out.print(", ");
        }
    }
    public static void main(String[] args)
    {   // этот метод вызывает метод "massiv" и помещает его в массив "array", а...
        int[] array = massiv();
        printMassiv(array);
    }
}
