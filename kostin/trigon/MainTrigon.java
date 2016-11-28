package ru.userboot.java2016.zadachi.kostin.trigon;

/**
 * Created by UserBoot on 26.11.2016.
 */
public class MainTrigon {
    public static void main(String[] args) {
        Trigon trigon = new Trigon();
        trigon.getClass();
        trigon.print();

        double периметрТреугольника = trigon.периметр();
        double площадьТреугольника = trigon.площадь();
        System.out.println("Периметр треугольника = " + периметрТреугольника);
        System.out.println("Площадь треугольника = " + площадьТреугольника);

        trigon.поворот();
    }
}
