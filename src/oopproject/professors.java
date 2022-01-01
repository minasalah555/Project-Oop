/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;
import java.util.InputMismatchException;

public class professors extends Person {

    private String subject;
    private int salary;
    private String department;
    private int Bonus;

    public professors() {
    }

    public professors(String name, String phone, int age, String city, int Id,
            String Gender, String subject, int salary, String department, int Bonus) {
        super(name, phone, age, city, Id, Gender);
        this.subject = subject;
        this.salary = salary;
        this.department = department;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int calcSalary() {
        return Bonus + salary;
    }

    public String toString() {
        return "ID : " + getId() + "\nProfessor's name is  " + getName() + "\nhis phone is   " + getPhone()
                + "\nhis age is  " + getAge()
                + "\nthe city is " + getCity() + "\nGender is : " + getGender() + "\nDepartment : " + department + "\nThe subject he teaches  : " + subject + "\nSalary  :  "
                + salary + "Total Salary = " + calcSalary()
                + "\n   ____________________    \n";

    }

}
