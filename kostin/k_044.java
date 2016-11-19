package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 14.11.2016.
 */

//Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения
// возвращать случайное целое число из отрезка [a; b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.

public class k_044 {
    public static void main(String[] args) {
        int massiv [] = new int[20];
        System.out.print("[");
        for (int i = 0; i < massiv.length; i++){
            massiv[i] = sluchaynoeCeloe();
        System.out.print(massiv[i] + ", ");
        if (i == massiv.length - 1)
            System.out.print(massiv[i]);}
        System.out.println("]");
    }
     public static int sluchaynoeCeloe(){
        int a = -7, b = 13;
        return (int) (Math.random()*(b + (Math.abs(a) + 1))) - Math.abs(a);
    }
}
