package ru.userboot.java2016.zadachi.shevchuk.book;

/**
 * Created by UserBoot on 20.11.2016.
 */
public class Author {
    final String author;
    public static final String ANSI_CYAN = "\u001B[36m";

    public Author(String author) {
        this.author = author;
    }

    void Show() {

        System.out.println(ANSI_CYAN + "Автор: " + author);
    }
}
