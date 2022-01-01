package oopproject;
import java.util.InputMismatchException;

import java.util.ArrayList;

public abstract class Person {

    private String name;
    private String phone;
    private int age;
    private String city;
    private int Id;
    private String Gender;

    public Person() {
    }

    public Person(String name, String phone, int age, String city, int Id, String Gender) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.Id = Id;
        this.Gender = Gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    abstract public String toString();

}
