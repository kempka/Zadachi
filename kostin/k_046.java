package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import static ru.userboot.java2016.zadachi.kostin.k_044.sluchaynoeCeloe;

/**
 * Created by UserBoot on 14.11.2016.
 */

// Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.

public class k_046 {
    public static void main(String[] args) {
        int massiv2 [][] = new int[5][10];
        for(int i=0; i<massiv2.length; i++) {
            for(int j=0; j<massiv2[i].length; j++) {
                massiv2[i][j] = sluchaynoeCeloe();
            }
        }
            for(int i = 0; i < 5; i++){
                // Сортировка "пузырьком" по возрастанию
                for(int j = massiv2[i].length-1 ; j > 0 ; j--) {
                    for (int k = 0; k < j; k++) {
                        if (massiv2[i][k] < massiv2[i][k + 1]) {
                            int tmp = massiv2[i][k+1];
                            massiv2[i][k+1] = massiv2[i][k];
                            massiv2[i][k] = tmp;
                        }
                    }
                System.out.print(massiv2[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
