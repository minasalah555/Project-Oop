package model;

/**
 * Administrator class for faculty administrative staff
 */
public class Administrator extends Employee {
    private String jobDescription;
    private String email;
    private String address;
    private int officeNumber;

    // Default constructor
    public Administrator() {
        super();
        this.employeeType = "Administrator";
    }

    // Parameterized constructor
    public Administrator(String name, String phone, int age, String city, int id, String gender,
                        double salary, String department, String qualification,
                        String jobDescription, String email, String address, int officeNumber) {
        super(name, phone, age, city, id, gender, salary, department, "Administrator", qualification);
        this.jobDescription = jobDescription;
        this.email = email;
        this.address = address;
        this.officeNumber = officeNumber;
    }

    // Getters and Setters
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        if (officeNumber > 0) {
            this.officeNumber = officeNumber;
        } else {
            throw new IllegalArgumentException("Office number must be positive");
        }
    }

    @Override
    public String toString() {
        return String.format("""
            ================ ADMINISTRATOR =================
            ID: %d
            Name: %s
            Phone: %s
            Age: %d
            City: %s
            Gender: %s
            Department: %s
            Qualification: %s
            Job Description: %s
            Email: %s
            Address: %s
            Office Number: %d
            Salary: $%.2f
            ===============================================
            """, id, name, phone, age, city, gender, department, qualification,
            jobDescription, email, address, officeNumber, salary);
    }

    @Override
    public boolean matches(String searchTerm) {
        return super.matches(searchTerm) ||
               (email != null && email.toLowerCase().contains(searchTerm.toLowerCase())) ||
               (jobDescription != null && jobDescription.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}