package ru.userboot.java2016.zadachi.kostin;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 04.11.2016.
 */

//В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
// Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
// «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
// Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
// С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

public class k_022 {
    public static void main(String[] args) {
        int schastlyviy = 0;
        int a1 = 999;
        int a2 = 1;
        int b1 = 0;
        int b2 = 0;
        while (a2 < 1000) {
            int d1 = razlozch1(a1, b1);         // Вызов метода
            int d2 = razlozch2(a2, b2);         // Вызов метода
            if (d1 == d2){
                schastlyviy++;}
            a1--;
            if (a1 == 0){
                a1 = 999;
                a2++;}
        }
        System.out.println("Счастливых билетов: " + schastlyviy);
    }
    private static int razlozch1(int a1, int b1){
        do {
            b1 += a1 % 10;
            a1 = a1 / 10;}while (a1 > 0);
        return b1;
    }
    private static int razlozch2(int a2, int b2){
        do {
            b2 += a2 % 10;
            a2 = a2 / 10;}while (a2 > 0);
        return b2;
    }
}