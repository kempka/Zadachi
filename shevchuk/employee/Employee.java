package ru.userboot.java2016.zadachi.shevchuk.employee;
// ДАННАЯ ЗАДАЧА РЕШАЛАСЬ В УЧЕБНЫХ ЦЕЛЯХ И ЕЁ ПРАВИЛЬНОСТЬ НЕ ГАРАНТИРОВАНА!

/**
 * Created by UserBoot on 07.12.2016.
 */
public class Employee {
    private String name1;       // имя
    private String name2;       // фамилия
    private static String proff;       // должность
    private static double zp;          // зарплата
    private static double tax = 12;    // налог
    private static int stage;          // стаж

    public double raschet() {
        double raschet2 = getZp()-(getZp()*getTax()/100)+(getStage()+getZp()/100);
        return raschet2;
    }

    public Employee(String a, String b) {
        this.name1 = a;
        this.name2 = b;
        System.out.println("Фамилия: " + b);
        System.out.println("Имя: " + a);
    }
    public Employee() {
        System.out.println("Должность: " + getProff());
        System.out.println("Стаж: " + getStage());
        System.out.println("Итого: " + raschet());
    }

    public String getProff() {
        return proff;
    }

    public void setProff(String proff) {
        this.proff = proff;
    }

    public double getZp() {
        return zp;
    }

    public void setZp(double zp) {
        this.zp = zp;
    }

    public double getTax() {
        return tax;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
