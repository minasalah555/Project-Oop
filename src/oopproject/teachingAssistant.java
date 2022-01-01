
package oopproject;
import java.util.InputMismatchException;

public class teachingAssistant extends professors {

    private int deduction;
    private String masterName;

    public teachingAssistant() {
    }

    public teachingAssistant(String name, String phone, int age, String city,
            int Id, String Gender, String subject, int salary,
            String department, int Bonus, int deduction, String masterName) {
        super(name, phone, age, city, Id, Gender, subject, salary, department, Bonus);
        this.deduction = deduction;
        this.masterName = masterName;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public int calcSalary() {
        return super.calcSalary() - deduction;

    }

    public String toString() {
        return "ID : " + getId() + "\nTeaching Assistant name is  " + getName() + "\nhis phone is   " + getPhone()
                + "\nhis age is  " + getAge()
                + "\nthe city is " + getCity() + "\nGender is : " + getGender() + "\nDepartment : " + getDepartment() + "\nThe subject he teaches  : " + getSubject() + "\nSalary  :  "
                + getSalary() + "Total Salary = " + calcSalary()
                + "\n   ____________________    \n";
    }

}
