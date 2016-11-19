package ru.userboot.java2016.zadachi.tipovye_zadachi.massivy.odnomernye;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 26.10.2016.
 */
public class Cod_s_kontrolem_vremeny {
    public static void main(String[] args) {
        int n = 8000;

        int g[][] = new int[n][n];
        long st, en;

        // one
        st = System.nanoTime();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                g[i][j] = i + j;
            }
        }
        en = System.nanoTime();
        System.out.println("\nOne time " + (en - st)/1000000.d + " msc");

        // two
        st = System.nanoTime();
        for(int i = 0; i < n; i++) {
            g[i][i] =  i + i;
            for(int j = 0; j < i; j++) {
                g[j][i] = g[i][j] = i + j;
            }
        }
        en = System.nanoTime();
        System.out.println("\nTwo time " + (en - st)/1000000.d + " msc");
    }
}
