package oopproject;

import java.util.Scanner;

public class Workers extends Person {

    private double salary;
    private boolean fulltime;
    private int workHours;

    public Workers() {
    }

    public Workers(String name, String phone, int age, String city, int salary, int workHours, int Id, String Gender) {
        super(name, phone, age, city, Id, Gender);

        this.workHours = workHours;
        if (workHours >= 4) {
            fulltime = true;
        } else {
            fulltime = false;
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    @Override
    public String toString() {
        return "this worker's name is  " + getName() + "\nhis phone is   " + getPhone()
                + "\nhis age is  " + getAge()
                + "\nthe city is " + getCity() + "\nhis  salary : " + salary + "\nhe works  "
                + workHours + " per a day " + "\nand he works fulltime =  " + fulltime
                + "id = " + getId() + " gender : " + getGender() + " \n   ____________________    \n";
    }

    /*


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (fulltime ? 1231 : 1237);
	result = prime * result + salary;
	result = prime * result + workHours;
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof workers)) {
		return false;
	}
	workers other = (workers) obj;
	if (fulltime != other.fulltime) {
		return false;
	}
	if (salary != other.salary) {
		return false;
	}
	if (workHours != other.workHours) {
		return false;
	}
	return true;
}
     */
}
