package ru.userboot.java2016.zadachi.shevchuk.book;

/**
 * Created by UserBoot on 20.11.2016.
 */
public class Title {
    final String title;
    public static final String ANSI_BLUE = "\u001B[34m";

    public Title(String title) {
        this.title = title;
    }

    void Show() {

        System.out.println(ANSI_BLUE + "Название: " + title);
    }
}
