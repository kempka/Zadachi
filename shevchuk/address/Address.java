package ru.userboot.java2016.zadachi.shevchuk.address;

/**
 * Created by UserBoot on 20.11.2016.
 */

//        Создать класс с именем Address.
//        В теле класса требуется создать поля: index, country, city, street, house, apartment.
// Для каждого поля, создать свойство с двумя методами доступа.
//        Создать экземпляр класса Address.
//        В поля экземпляра записать информацию о почтовом адресе.
//        Выведите на экран значения полей, описывающих адрес.

public class Address {
    String index;
    String country;
    String city;
    String street;
    String house;
    String apartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

}
