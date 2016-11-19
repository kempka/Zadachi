package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 15.11.2016.
 */

// Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
// вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).

public class k_048 {
    public static void main(String[] args){
        long st, en;
        st = System.nanoTime();     // Помещаем системное время в переменную (в наносек).
        int massiv [] = new int[1000];
        int n;
        for (int i = 1; i < massiv.length; i++){
            n = i;
            massiv[i] = fib(n);
            en = System.nanoTime();
        System.out.print(massiv[i] + ", ");
            // Наносекунды преобразуем в миллисекунды и если разность переменных с
            // системным временем равна минуте останавливаем программу с выводом соответствующего сообщения.
            if ((en - st)/1000000.d >= 60000){
                System.out.println();
                System.out.println("После вывода "+ i +"-го элемента, вычисление с использованием рекурсии становится неприемлемым.");
                break;
            }
        }
    }
        public static int fib (long n) {
            if (n==1 || n == 2) {
                return 1;
            }
            return fib (n-2) + fib (n-1);
    }
}
