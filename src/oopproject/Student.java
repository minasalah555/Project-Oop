package oopproject;
import java.util.InputMismatchException;

public class Student extends Person {

    String grade;
    int gba;

    public Student() {
    }

    public Student(String name, String phone, int age, String city, int Id,
            String Gender, String grade, int gba) {
        super(name, phone, age, city, Id, Gender);
        this.grade = grade;
        this.gba = gba;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getGba() {
        return gba;
    }

    public void setGba(int gba) {
        this.gba = gba;
    }

    public String toString() {

        return "ID : " + getId() + " \nStudent's name is  " 
                + getName() + " \nhis phone is   " + getPhone()
                + "\nhis age is  " + getAge()
                + "\nthe city is " + getCity() + "\nGender is : " + getGender()
                + "\n He is in grade  : " 
                + grade + "\nHis GBA is :  "
                + gba
                + "\n   ____________________    \n";

    }

}
