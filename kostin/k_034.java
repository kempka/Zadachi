package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserBoot on 08.11.2016.
 */

//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных (вещественных) чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
public class k_034 {
    public static void main(String[] args) {
        List<Integer> am1 = new ArrayList<Integer>();
        List<Integer> am2 = new ArrayList<Integer>();
        List<Double> am3 = new ArrayList<Double>();
        int b = 0;
        for (int i = 0; i < 10; i++) {
            am1.add((int) (Math.random() * 9) + 1);
        }
        for (int i = 0; i < 10; i++) {
            am2.add((int) (Math.random() * 9) + 1);
        }
        System.out.println(am1);
        System.out.println(am2);
        for (int i = 0; i < 10; i++) {
            am3.add((double)am1.get(b) / (double)am2.get(b));
            b++;
        }
        System.out.println(am3);
    }
}
