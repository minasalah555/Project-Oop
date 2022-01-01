
package oopproject;
import java.util.InputMismatchException;

public class Employee {
     String name;
 int age;
 int employeecode;
 String qualification;
 String gender;
 String socialstatus;
 String addres;
 int cardnumber;
 String typeofemployment;
 int salary;

    public Employee() {
    }

    public Employee(String name, int age, int employeecode, String qualification, String gender, String socialstatus, String addres, int cardnumber, String typeofemployment, int salary) {
        this.name = name;
        this.age = age;
        this.employeecode = employeecode;
        this.qualification = qualification;
        this.gender = gender;
        this.socialstatus = socialstatus;
        this.addres = addres;
        this.cardnumber = cardnumber;
        this.typeofemployment = typeofemployment;
        this.salary = salary;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocialstatus() {
        return socialstatus;
    }

    public void setSocialstatus(String socialstatus) {
        this.socialstatus = socialstatus;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getTypeofemployment() {
        return typeofemployment;
    }

    public void setTypeofemployment(String typeofemployment) {
        this.typeofemployment = typeofemployment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age +
                ", employeecode=" + employeecode + ", qualification=" + qualification 
                + ", gender=" + gender + ", socialstatus=" + socialstatus
                + ", addres=" + addres + ", cardnumber=" + cardnumber + 
                ", typeofemployment=" + typeofemployment + 
                ", salary=" + salary +"\n   ____________________    \n"+'}';
    }
 }
