package model;

/**
 * Worker class for general faculty workers
 */
public class Worker extends Employee {
    private int workHours;
    private boolean isFullTime;
    private double hourlyRate;

    // Default constructor
    public Worker() {
        super();
        this.employeeType = "Worker";
    }

    // Parameterized constructor
    public Worker(String name, String phone, int age, String city, int id, String gender,
                 double salary, String department, String qualification, 
                 int workHours, double hourlyRate) {
        super(name, phone, age, city, id, gender, salary, department, "Worker", qualification);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
        this.isFullTime = workHours >= 40;
    }

    // Getters and Setters
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if (workHours >= 0 && workHours <= 80) {
            this.workHours = workHours;
            this.isFullTime = workHours >= 40;
        } else {
            throw new IllegalArgumentException("Work hours must be between 0 and 80");
        }
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("""
            =================== WORKER ===================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Work Hours: %d/week
            Employment Type: %s
            Hourly Rate: $%.2f
            Base Salary: $%.2f
            Calculated Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            workHours, (isFullTime ? "Full-time" : "Part-time"), hourlyRate, salary, calculateSalary());
    }
}