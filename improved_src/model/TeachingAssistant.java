package model;

/**
 * Teaching Assistant class extending Professor
 */
public class TeachingAssistant extends Professor {
    private int deduction;
    private String masterDegreeIn;
    private Professor supervisor;

    // Default constructor
    public TeachingAssistant() {
        super();
        this.employeeType = "Teaching Assistant";
        this.academicRank = "Teaching Assistant";
    }

    // Parameterized constructor
    public TeachingAssistant(String name, String phone, int age, String city, int id, String gender,
                           double salary, String department, String qualification,
                           double bonus, int yearsOfExperience, int deduction, String masterDegreeIn) {
        super(name, phone, age, city, id, gender, salary, department, qualification,
              bonus, "Teaching Assistant", yearsOfExperience);
        this.deduction = deduction;
        this.masterDegreeIn = masterDegreeIn;
    }

    // Getters and Setters
    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        if (deduction >= 0) {
            this.deduction = deduction;
        } else {
            throw new IllegalArgumentException("Deduction cannot be negative");
        }
    }

    public String getMasterDegreeIn() {
        return masterDegreeIn;
    }

    public void setMasterDegreeIn(String masterDegreeIn) {
        this.masterDegreeIn = masterDegreeIn;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() - deduction;
    }

    @Override
    public String toString() {
        return String.format("""
            ============== TEACHING ASSISTANT ==============
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Master's Degree In: %s
            Years of Experience: %d
            Subjects: %s
            Supervisor: %s
            Base Salary: $%.2f
            Bonus: $%.2f
            Deduction: $%.2f
            Total Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            masterDegreeIn, yearsOfExperience, getSubjects().toString(),
            (supervisor != null ? supervisor.getName() : "Not Assigned"),
            salary, bonus, (double)deduction, calculateSalary());
    }

    @Override
    public boolean matches(String searchTerm) {
        return super.matches(searchTerm) ||
               (masterDegreeIn != null && masterDegreeIn.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}