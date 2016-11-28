package ru.userboot.java2016.zadachi.kostin.circle;

// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И НЕ ГАРАНТИРОВАНА ЕЁ ПРАВИЛЬНОСТЬ!

/**
 * Created by UserBoot on 19.11.2016.
 */

public class App {
    public static void main(String[] args) {

        // Выводим длину первой окружности
        Circle circle1 = new Circle();
        int radius1 = 21;
        int lengthOfCircle = circle1.lengthCircle(radius1);
        System.out.println("Длина первой окружности = " + lengthOfCircle);
        System.out.println();

        int x1 = 0, y1 = 0;
        circle1.remove(x1, y1);
        x1 = circle1.x;
        y1 = circle1.y;
        //Thread.Sleep(100);      // задержка
        System.out.println("Радиус первой окружности = " + radius1);
        System.out.println("Координаты первой окружности: (" + x1 + "; " + y1 + ")");

        Circle circle2 = new Circle(0, 0, 0);
        int x2, y2, radius2;
        x2 = circle2.x;
        y2 = circle2.y;
        radius2 = circle2.r;
        System.out.println("Радиус второй окружности = " + radius2);
        System.out.println("Координаты второй окружности: (" + x2 + "; " + y2 + ")");

        int lengthBtwn = circle1.lengthBetween(x1, x2, y1, y2);
        System.out.println("Расстояние между центрами двух окружностей: " + lengthBtwn);

        circle1.touchCircle(radius1, radius1, lengthBtwn);

        System.out.print("Центр первой окружности ");
        circle1.chetvert(x1, y1);
        System.out.print("Центр второй окружности ");
        circle2.chetvert(x2, y2);

        circle1.Simmetriya(x1, x2, y1, y2);

        int x3, y3;
        x3 = circle1.x;
        y3 = circle1.y;
        System.out.println("Координаты третьей окружности: (" + x3 + "; " + y3 + ")");
        circle1.Collinear(x1, x2, y1, y2, x3, y3);

        System.out.println(circle1.equals(circle2)
                ? "Центры двух окружностей в одной точке"
                : "Центры двух окружностей в разных точках");
    }
}
