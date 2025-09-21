package model;

import interfaces.Payable;

/**
 * Abstract Employee class for all faculty staff
 */
public abstract class Employee extends Person implements Payable {
    protected double salary;
    protected String department;
    protected String employeeType;
    protected String qualification;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(String name, String phone, int age, String city, int id, String gender,
                   double salary, String department, String employeeType, String qualification) {
        super(name, phone, age, city, id, gender);
        this.salary = salary;
        this.department = department;
        this.employeeType = employeeType;
        this.qualification = qualification;
    }

    // Getters and Setters
    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Default implementation of calculateSalary
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public boolean matches(String searchTerm) {
        return super.matches(searchTerm) ||
               (department != null && department.toLowerCase().contains(searchTerm.toLowerCase())) ||
               (employeeType != null && employeeType.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}