package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Technician class for faculty technical staff
 */
public class Technician extends Employee {
    private List<String> specializations;
    private double hourlyWage;
    private int hoursWorked;
    private String certificationLevel;

    // Default constructor
    public Technician() {
        super();
        this.specializations = new ArrayList<>();
        this.employeeType = "Technician";
    }

    // Parameterized constructor
    public Technician(String name, String phone, int age, String city, int id, String gender,
                     double salary, String department, String qualification,
                     double hourlyWage, int hoursWorked, String certificationLevel) {
        super(name, phone, age, city, id, gender, salary, department, "Technician", qualification);
        this.specializations = new ArrayList<>();
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.certificationLevel = certificationLevel;
    }

    // Getters and Setters
    public List<String> getSpecializations() {
        return new ArrayList<>(specializations);
    }

    public void addSpecialization(String specialization) {
        if (specialization != null && !specialization.trim().isEmpty() && 
            !specializations.contains(specialization)) {
            specializations.add(specialization.trim());
        }
    }

    public void removeSpecialization(String specialization) {
        specializations.remove(specialization);
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0) {
            this.hourlyWage = hourlyWage;
        } else {
            throw new IllegalArgumentException("Hourly wage cannot be negative");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0 && hoursWorked <= 80) {
            this.hoursWorked = hoursWorked;
        } else {
            throw new IllegalArgumentException("Hours worked must be between 0 and 80");
        }
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    @Override
    public double calculateSalary() {
        double hourlyPay = hourlyWage * hoursWorked;
        double certificationBonus = 0;
        
        // Certification bonus
        if ("Expert".equalsIgnoreCase(certificationLevel)) {
            certificationBonus = salary * 0.20;
        } else if ("Advanced".equalsIgnoreCase(certificationLevel)) {
            certificationBonus = salary * 0.15;
        } else if ("Intermediate".equalsIgnoreCase(certificationLevel)) {
            certificationBonus = salary * 0.10;
        }
        
        return salary + hourlyPay + certificationBonus;
    }

    @Override
    public String toString() {
        return String.format("""
            ================== TECHNICIAN =================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Specializations: %s
            Certification Level: %s
            Hourly Wage: $%.2f
            Hours Worked: %d
            Base Salary: $%.2f
            Total Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            specializations.toString(), certificationLevel, hourlyWage, hoursWorked,
            salary, calculateSalary());
    }

    @Override
    public boolean matches(String searchTerm) {
        boolean specializationMatch = specializations.stream()
            .anyMatch(spec -> spec.toLowerCase().contains(searchTerm.toLowerCase()));
        return super.matches(searchTerm) ||
               (certificationLevel != null && certificationLevel.toLowerCase().contains(searchTerm.toLowerCase())) ||
               specializationMatch;
    }
}