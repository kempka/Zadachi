package ru.userboot.java2016.zadachi.shevchuk.book;

/**
 * Created by UserBoot on 20.11.2016.
 */
public class Program_Bk {
    public static void main(String[] args) {
        String content = "Действие книги начинается летом 1805 г. в Петербурге. На вечере у фрейлины Шерер присутствуют среди прочих гостей Пьер Безухов, незаконный сын богатого вельможи, и князь Андрей Болконский. Разговор заходит о Наполеоне, и оба друга пытаются защитить великого человека от осуждений хозяйки вечера и её гостей. Князь Андрей собирается на войну, потому что мечтает о славе, равной славе Наполеона, а Пьер не знает, чем ему заняться, участвует в кутежах петербургской молодёжи (здесь особое место занимает Федор Долохов, бедный, но чрезвычайно волевой и решительный офицер); за очередное озорство Пьер выслан из столицы, а Долохов разжалован в солдаты.";
        Book book = new Book("Война и мир", "Л.Н. Толстой", content);
        book.show();
    }
}