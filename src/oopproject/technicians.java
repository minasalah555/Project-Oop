package oopproject;
import java.util.InputMismatchException;

public class technicians extends Person {

    private String department;
    private int hourwage;
    private int hourwark;
    private int salary;

    public technicians() {
    }

    public technicians(String name, String phone, int age, String city, int Id,
            String Gender, String department, int hourwage, int hourwark, int salary) {
        super(name, phone, age, city, Id, Gender);
        this.department = department;
        this.hourwage = hourwage;
        this.hourwark = hourwark;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHourwage() {
        return hourwage;
    }

    public void setHourwage(int hourwage) {
        this.hourwage = hourwage;
    }

    public int getHourwark() {
        return hourwark;
    }

    public void setHourwark(int hourwark) {
        this.hourwark = hourwark;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int calcSalary() {
        return salary + (hourwage * hourwark);

    }

    public String toString() {
        return "ID : " + getId() + "\nTechinician's name is  " + getName() + "\nhis phone is   " + getPhone()
                + "\nhis age is  " + getAge()
                + "\nThe city is " + getCity() + "\nGender is : " + getGender() + "\nDepartment : " + getDepartment() + "\nTotal Salary   : " + calcSalary() + "\nSalary  :  "
                + salary + "\nHe works  " + hourwark + " per day "
                + "\n   ____________________    \n";
    }
}
