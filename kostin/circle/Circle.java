package ru.userboot.java2016.zadachi.kostin.circle;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

import java.util.Scanner;

/**
 * Created by UserBoot on 19.11.2016.
 */

// Создайте в классе Circle метод, вычисляющий длину окружности.

// Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости
// с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод,
// применимый к уже существующему объекту, а не конструктор создающий новый объект.

// Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
// координаты центра и радиус окружности пользователь вводил с клавиатуры.

// Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.

// Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен вариант,
// когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.

// Создайте в классе метод, который будет выводить на экран сообщение о том, в какой координатной четверти лежит центр окружности.

// Создайте в классе метод, проверяющий, являются ли два центра окружности симметричными относительно начала отсчёта.

// Создайте в классе метод, проверяющий, являются ли три центра окружности коллинеарными(т.е.лежащими на одной прямой).

// Вместо представленного метода remove перегрузите в классе методы equals и hashCode.

public class Circle {
    // свойства класса
    public int x; // абсцисса центра
    public int y; // ордината центра
    public int r; // радиус

    // Конструктор по умолчанию.
    public Circle() { }

    // метод, вычисляющий длину окружности.
    public int lengthCircle(int r)
    {
        return (int)Math.PI * 2 * r;
    }

    // метод, перемещающий центр круга в случайную точку квадрата координатной плоскости
    public void remove(int a, int b){
        this.x = (int) (Math.random() * 199) - 99;
        this.y = (int) (Math.random() * 199) - 99;
    }

    // Конструктор
    public Circle(int a, int b, int c)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите координаты x и нажмите Enter: ");
        x = scan.nextInt();
        System.out.print("Введите координаты y и нажмите Enter: ");
        y = scan.nextInt();
        System.out.print("Введите радиус и нажмите Enter: ");
        r = scan.nextInt();    }

    // метод, вычисляющий расстояние между центрами двух окружностей.
    public int lengthBetween(int a1, int b1, int a2, int b2)
    {
        return (int)Math.sqrt(Math.pow(a1 - a2, 2) + Math.pow(b1 - b2, 2));
    }

    // метод проверяющий, касаются ли две окружности
    public void touchCircle(int a, int b, int c)
    {
        if (a + b == c)
        {
            System.out.println("Окружности касаются снаружи.");
        }
        System.out.println(Math.abs(a - b) == c
                ? "Окружности касаются, одна содержится внутри другой."
                : "Окружности не касаются.");
    }

    // метод, в какой координатной четверти лежит точка.
    public void chetvert(int a, int b)
    {
        if (a > 0 && b > 0)
        {
            System.out.println("лежит в первой четверти");
        }
        if (a < 0 && b > 0)
        {
            System.out.println("лежит во второй четверти");
        }
        if (a < 0 && b < 0)
        {
            System.out.println("лежит в третей четверти");
        }
        if (a > 0 && b < 0)
        {
            System.out.println("лежит в четвертой четверти");
        }
        if (a == 0 || b == 0)
        {
            System.out.println("лежит на одной из координатной прямой");
        }
        if (a == 0 && b == 0)
        {
            System.out.println("лежит середине координат");
        }
    }

    // метод, проверяющий, являются ли две точки симметричными относительно начала отсчёта.
    public void Simmetriya(int a1, int b1, int a2, int b2)
    {
        if (Math.abs(a1) == Math.abs(a2) && Math.abs(b1) == Math.abs(b2))
        {
            System.out.println("Окружности симметричны относительно начала отсчёта");
        }
        else { System.out.println("Окружности не симметричны относительно начала отсчёта"); }
    }

    // метод, проверяющий, являются ли три центра окружности коллинеарными.
    public void Collinear(int a1, int b1, int a2, int b2, int a3, int b3)
    {
        System.out.println(((a1 * b2 + a2 * b3 + a3 * b1) - (a2 * b1 + a3 * b2 + a1 * b3)) / 2 == 0
                ? "Окружности коллинеарны"
                : "Окружности не коллинеарны");
    }

    // методы перегрузки Equals и HashCode.

    // сначала переопределим метод ToString

    @Override
    public String toString()
    {
        String info;
        info = String.format("x = {0}, y = {1}, r = {2}", x, y, r);
        return info;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (obj != null && obj == getClass())
        {
            Circle tempCircle = (Circle)obj;
            if (this.x == tempCircle.x && this.y == tempCircle.y)
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return this.toString().hashCode();
    }
}
