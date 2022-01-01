
package oopproject;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrators {
    
        private String name;
    private String address;
    private String email;
    private String KindOfJob;
    private String Gender;
    private String DescriptionOfJob;
    private int Id;
    private int phone;
    private int age;
    private double Salary;

    public Administrators(String name, String address, String email, String KindOfJob, String Gender, String DescriptionOfJob, int Id, int phone, int age, int Salaris) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.KindOfJob = KindOfJob;
        this.Gender = Gender;
        this.DescriptionOfJob = DescriptionOfJob;
        this.Id = Id;
        this.phone = phone;
        this.age = age;
        this.Salary = Salary;
    }

    public Administrators() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKindOfJob() {
        return KindOfJob;
    }

    public void setKindOfJob(String KindOfJob) {
        this.KindOfJob = KindOfJob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDescriptionOfJob() {
        return DescriptionOfJob;
    }

    public void setDescriptionOfJob(String DescriptionOfJob) {
        this.DescriptionOfJob = DescriptionOfJob;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Administrators" + "name=" + name + ", address=" + address + 
                ", email=" + email + ", KindOfJob=" + KindOfJob +
                ", Gender=" + Gender + ", DescriptionOfJob=" + DescriptionOfJob +
                ", Id=" + Id + ", phone=" + phone + 
                ", age=" + age + ", Salary=" + Salary +"\n   ____________________    \n";
    }
 
    
}
