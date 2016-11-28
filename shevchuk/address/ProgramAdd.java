package ru.userboot.java2016.zadachi.shevchuk.address;

/**
 * Created by UserBoot on 20.11.2016.
 */

public class ProgramAdd {
    public static void main(String[] args){

        Address address = new Address();

        address.index = "123456";
        address.country = "Россия";
        address.city = "Москва";
        address.street = "Тверская";
        address.house = "10";
        address.apartment = "23";

        System.out.println(address.index);
        System.out.println(address.country);
        System.out.println(address.city);
        System.out.println(address.street);
        System.out.println(address.house);
        System.out.println(address.apartment);
    }
}
