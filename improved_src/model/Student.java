package model;

/**
 * Student class representing students in the faculty
 */
public class Student extends Person {
    private String grade;
    private double gpa; // Changed from gba to gpa for clarity
    private String major;
    private int yearOfStudy;

    // Default constructor
    public Student() {
        super();
    }

    // Parameterized constructor
    public Student(String name, String phone, int age, String city, int id, String gender,
                  String grade, double gpa, String major, int yearOfStudy) {
        super(name, phone, age, city, id, gender);
        this.grade = grade;
        this.gpa = gpa;
        this.major = major;
        this.yearOfStudy = yearOfStudy;
    }

    // Getters and Setters
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy >= 1 && yearOfStudy <= 6) {
            this.yearOfStudy = yearOfStudy;
        } else {
            throw new IllegalArgumentException("Year of study must be between 1 and 6");
        }
    }

    // Business methods
    public String getAcademicStatus() {
        if (gpa >= 3.5) return "Excellent";
        else if (gpa >= 3.0) return "Very Good";
        else if (gpa >= 2.5) return "Good";
        else if (gpa >= 2.0) return "Pass";
        else return "Fail";
    }

    @Override
    public String toString() {
        return String.format("""
            =================== STUDENT ===================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Major: %s
            Year of Study: %d
            Grade: %s
            GPA: %.2f
            Academic Status: %s
            ===============================================
            """, id, name, phone, age, city, gender, major, yearOfStudy, grade, gpa, getAcademicStatus());
    }

    @Override
    public boolean matches(String searchTerm) {
        return super.matches(searchTerm) || 
               (major != null && major.toLowerCase().contains(searchTerm.toLowerCase())) ||
               (grade != null && grade.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}