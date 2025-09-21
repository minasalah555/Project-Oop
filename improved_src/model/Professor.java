package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Professor class for faculty professors
 */
public class Professor extends Employee {
    private List<String> subjects;
    private double bonus;
    private String academicRank;
    private int yearsOfExperience;

    // Default constructor
    public Professor() {
        super();
        this.subjects = new ArrayList<>();
        this.employeeType = "Professor";
    }

    // Parameterized constructor
    public Professor(String name, String phone, int age, String city, int id, String gender,
                    double salary, String department, String qualification, 
                    double bonus, String academicRank, int yearsOfExperience) {
        super(name, phone, age, city, id, gender, salary, department, "Professor", qualification);
        this.subjects = new ArrayList<>();
        this.bonus = bonus;
        this.academicRank = academicRank;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters and Setters
    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void addSubject(String subject) {
        if (subject != null && !subject.trim().isEmpty() && !subjects.contains(subject)) {
            subjects.add(subject.trim());
        }
    }

    public void removeSubject(String subject) {
        subjects.remove(subject);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) {
            this.yearsOfExperience = yearsOfExperience;
        } else {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
    }

    @Override
    public double calculateSalary() {
        double experienceBonus = yearsOfExperience * 100; // $100 per year of experience
        return salary + bonus + experienceBonus;
    }

    @Override
    public String toString() {
        return String.format("""
            ================== PROFESSOR ==================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Academic Rank: %s
            Years of Experience: %d
            Subjects: %s
            Base Salary: $%.2f
            Bonus: $%.2f
            Total Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            academicRank, yearsOfExperience, subjects.toString(), salary, bonus, calculateSalary());
    }

    @Override
    public boolean matches(String searchTerm) {
        boolean subjectMatch = subjects.stream()
            .anyMatch(subject -> subject.toLowerCase().contains(searchTerm.toLowerCase()));
        return super.matches(searchTerm) || 
               (academicRank != null && academicRank.toLowerCase().contains(searchTerm.toLowerCase())) ||
               subjectMatch;
    }
}