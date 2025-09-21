package model;

/**
 * Security class for faculty security personnel
 */
public class Security extends Employee {
    private String shift; // Morning, Evening, Night
    private boolean isArmed;
    private String certificationLevel;
    
    private static final int MIN_AGE = 20;
    private static final int MAX_AGE = 50;

    // Default constructor
    public Security() {
        super();
        this.employeeType = "Security";
    }

    // Parameterized constructor
    public Security(String name, String phone, int age, String city, int id, String gender,
                   double salary, String department, String qualification,
                   String shift, boolean isArmed, String certificationLevel) {
        super(name, phone, age, city, id, gender, salary, department, "Security", qualification);
        this.shift = shift;
        this.isArmed = isArmed;
        this.certificationLevel = certificationLevel;
    }

    // Override setAge to add security-specific validation
    @Override
    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException(
                String.format("Security personnel age must be between %d and %d", MIN_AGE, MAX_AGE));
        }
    }

    // Getters and Setters
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (shift != null && (shift.equalsIgnoreCase("Morning") || 
                             shift.equalsIgnoreCase("Evening") || 
                             shift.equalsIgnoreCase("Night"))) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Shift must be Morning, Evening, or Night");
        }
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean isArmed) {
        this.isArmed = isArmed;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    // Static validation method
    public static boolean isValidAge(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    @Override
    public double calculateSalary() {
        double shiftBonus = 0;
        if ("Night".equalsIgnoreCase(shift)) {
            shiftBonus = salary * 0.15; // 15% night shift bonus
        } else if ("Evening".equalsIgnoreCase(shift)) {
            shiftBonus = salary * 0.10; // 10% evening shift bonus
        }
        
        double armedBonus = isArmed ? salary * 0.05 : 0; // 5% armed bonus
        
        return salary + shiftBonus + armedBonus;
    }

    @Override
    public String toString() {
        return String.format("""
            ================== SECURITY ===================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Shift: %s
            Armed: %s
            Certification Level: %s
            Base Salary: $%.2f
            Total Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            shift, (isArmed ? "Yes" : "No"), certificationLevel, salary, calculateSalary());
    }

    @Override
    public boolean matches(String searchTerm) {
        return super.matches(searchTerm) ||
               (shift != null && shift.toLowerCase().contains(searchTerm.toLowerCase())) ||
               (certificationLevel != null && certificationLevel.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}