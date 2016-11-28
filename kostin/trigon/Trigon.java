package ru.userboot.java2016.zadachi.kostin.trigon;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

import java.util.Scanner;

/**
 * Created by UserBoot on 26.11.2016.
 */

// Создайте класс треугольников на координатной плоскости, используя в качестве полей объекты-точки. Реализуйте в классе:
//        a) конструктор, позволяющий задавать вершины с клавиатуры;
//        b) метод print() выводящий описание треугольника на экран;
//        c) методы для вычисления периметра и площади треугольника.

// Доработайте конструктор таким образом, чтобы нельзя было задать три вершины, лежащие на одной прямой.
// Это несложно будет сделать с использованием метода из класса точек, который проверяет явлются ли точки коллинеарными.

// Инкапсулируйте поля таким образом, чтобы нельзя изменить значение любого из них так, чтобы вершины оказались на одной прямой.

// Создайте метод, поворачивающий треугольник вокруг центра тяжести на указанное в аргументе количество градусов.

public class Trigon {
    private int x1, x2, x3;
    private int y1, y2, y3;
    private double a, b, c;
    double периметр, полупериметр, площадь;

    Scanner scanner = new Scanner(System.in);

    // конструктор, позволяющий задавать вершины с клавиатуры
    public Trigon() {

        do {
            System.out.println("Задайте первую вершину");
            System.out.print("x1: ");
            this.x1 = scanner.nextInt();
            System.out.print("y1: ");
            this.y1 = scanner.nextInt();

            System.out.println("Задайте вторую вершину");
            System.out.print("x2: ");
            this.x2 = scanner.nextInt();
            System.out.print("y2: ");
            this.y2 = scanner.nextInt();

            System.out.println("Задайте третью вершину");
            System.out.print("x3: ");
            this.x3 = scanner.nextInt();
            System.out.print("y3: ");
            this.y3 = scanner.nextInt();

            if (!коллинеарность()) {
                System.out.println("Вершины не коллинеарны");
            } else {
                System.out.println("Вершины коллинеарны! Введите другие вершины.");
            }
        } while (коллинеарность());
    }

    // метод выводящий описание треугольника на экран
    public void print() {

        System.out.println("Координаты вершин треугольника: первая - (" + this.x1 + "; " + this.y1 + "), вторая - (" + this.x2 + "; " + this.y2 + "), третья - (" + this.x3 + "; " + this.y3 + ").");
    }

    // метод для вычисления периметра треугольника
    public double периметр() {

        a = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
        b = Math.sqrt(Math.pow((this.x3 - this.x2), 2) + Math.pow((this.y3 - this.y2), 2));
        c = Math.sqrt(Math.pow((this.x3 - this.x1), 2) + Math.pow((this.y3 - this.y1), 2));

        периметр = a + b + c;
        return периметр;
    }

    // метод для вычисления площади треугольника
    public double площадь() {

        полупериметр = периметр / 2;
        площадь = Math.sqrt(полупериметр * (полупериметр - a) * (полупериметр - b) * (полупериметр - c));
        return площадь;
    }

    // метод, проверяющий, являются ли три координаты коллинеарными.
    public boolean коллинеарность() {
        return (((this.x1 * this.y2 + this.x2 * this.y3 + this.x3 * this.y1) - (this.x2 * this.y1 + this.x3 * this.y2 + this.x1 * this.y3)) / 2 == 0
                ? true
                : false);
    }

    // метод, поворачивающий треугольник вокруг центра тяжести на указанное в аргументе количество градусов
    public void поворот() {
        double x0, y0;
        x0 = (this.x1 + this.x2 + this.x3) / 3;
        y0 = (this.y1 + this.y2 + this.y3) / 3;

        System.out.print("Введите угол поворота: ");
        int угол = scanner.nextInt();

        double xn1 = (this.x1 - x0) * Math.cos(угол) - (this.y1 - y0) * Math.sin(угол) + x0;
        double yn1 = (this.x1 - x0) * Math.sin(угол) - (this.y1 - y0) * Math.cos(угол) + x0;

        double xn2 = (this.x2 - x0) * Math.cos(угол) - (this.y2 - y0) * Math.sin(угол) + x0;
        double yn2 = (this.x2 - x0) * Math.sin(угол) - (this.y2 - y0) * Math.cos(угол) + x0;

        double xn3 = (this.x3 - x0) * Math.cos(угол) - (this.y3 - y0) * Math.sin(угол) + x0;
        double yn3 = (this.x3 - x0) * Math.sin(угол) - (this.y3 - y0) * Math.cos(угол) + x0;

        System.out.println("Новые координаты вершин треугольника: первая - (" + xn1 + "; " + yn1 + "), вторая - (" + xn2 + "; " + yn2 + "), третья - (" + xn3 + "; " + yn3 + ").");
    }
}
