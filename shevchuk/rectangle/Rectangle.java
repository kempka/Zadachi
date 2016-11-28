package ru.userboot.java2016.zadachi.shevchuk.rectangle;

/**
 * Created by UserBoot on 20.11.2016.
 */

// Создать класс с именем Rectangle.
//        В теле класса создать два поля, описывающие длины сторон double side1, side2.
//        Создать пользовательский конструктор Rectangle(double side1, double side2),
// в теле которого поля side1 и side2 инициализируются значениями аргументов.
//        Создать два метода, вычисляющие площадь прямоугольника - double AreaCalculator() и
// периметр прямоугольника - double PerimeterCalculator().
//        Создать два свойства double Area и double Perimeter с одним методом доступа get.
//        Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.

public class Rectangle {
    private double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double area() {
        String get;
        {
            return this.areaCalculator();
        }
    }

    public double perimeterCalculator() {
        return (side1 + side2) * 2;
    }

    public double perimeter() {
        String get;
        {
            return this.perimeterCalculator();
        }
    }

}
