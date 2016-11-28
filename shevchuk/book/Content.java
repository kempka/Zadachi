package ru.userboot.java2016.zadachi.shevchuk.book;

/**
 * Created by UserBoot on 20.11.2016.
 */
public class Content {
    final String content;
    public static final String ANSI_PURPLE = "\u001B[35m";

    public Content(String content) {
        this.content = content;
    }

    void Show() {

        System.out.println(ANSI_PURPLE + "" + content);
    }
}
