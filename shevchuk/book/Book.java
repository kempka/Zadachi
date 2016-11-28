package ru.userboot.java2016.zadachi.shevchuk.book;

/**
 * Created by UserBoot on 20.11.2016.
 */

//Создать класс Book.
//        Создать классы  Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void Show().
//        Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
//        Выведите на экран разными цветами при помощи метода  Show() название книги, имя автора и содержание.

public class Book {
    private final Title title;
    private final Author author;
    private final Content content;

    public Book(String title, String author, String content) {
        this.title = new Title(title);
        this.author = new Author(author);
        this.content = new Content(content);
    }
    public void show() {
        title.Show();
        author.Show();
        content.Show();
    }
}

