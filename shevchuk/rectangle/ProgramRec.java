package ru.userboot.java2016.zadachi.shevchuk.rectangle;

/**
 * Created by UserBoot on 20.11.2016.
 */
public class ProgramRec {
    public static void main(String[] args){

        double side1 = 10, side2 = 15;

        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println(rectangle.area() + ", " + rectangle.perimeter());
    }
}
