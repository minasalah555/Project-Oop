package oopproject;
import java.util.InputMismatchException;

public class Security {

    private String name;
    private String gender;
    private int age;
    private static int ageValidition = 20;
    private double salary;
    private int phone;
    private int id;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    static public boolean valid(int age) {
        if (age >= ageValidition && age < 50) {
            return true;
        } else {
            return false;
        }
    }

    public void setAge(int age) {
        if (age >= ageValidition && age < 50) {
            this.age = age;
        } else {
            System.out.println("Age not valid,please insert age between 20 and 50");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Security [name=" + name + ", gender=" + gender + ", age=" + age
                + ", salary=" + salary + ", phone=" + phone + ", id=" + id
                + ", city=" + city + "]";
    }

}
