import model.*;
import service.PersonService;
import service.FileService;
import util.InputValidator;
import interfaces.Payable;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class for the Faculty Management System
 * Improved version with better OOP principles and user interface
 */
public class FacultyManagementSystem {
    private PersonService personService;
    private FileService fileService;
    private Scanner scanner;

    public FacultyManagementSystem() {
        this.personService = new PersonService();
        this.fileService = new FileService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=================================================");
        System.out.println("    FACULTY MANAGEMENT SYSTEM - IMPROVED");
        System.out.println("=================================================");
        
        // Load existing data
        fileService.loadAllData(personService);
        
        while (true) {
            try {
                showMainMenu();
                int choice = InputValidator.getValidInteger(scanner, "Enter your choice: ", 0, 10);
                
                switch (choice) {
                    case 1 -> manageStudents();
                    case 2 -> manageWorkers();
                    case 3 -> manageProfessors();
                    case 4 -> manageTeachingAssistants();
                    case 5 -> manageAdministrators();
                    case 6 -> manageSecurity();
                    case 7 -> manageTechnicians();
                    case 8 -> searchPerson();
                    case 9 -> showStatistics();
                    case 10 -> saveAndExit();
                    case 0 -> exit();
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Manage Students");
        System.out.println("2. Manage Workers");
        System.out.println("3. Manage Professors");
        System.out.println("4. Manage Teaching Assistants");
        System.out.println("5. Manage Administrators");
        System.out.println("6. Manage Security");
        System.out.println("7. Manage Technicians");
        System.out.println("8. Search Person");
        System.out.println("9. Show Statistics");
        System.out.println("10. Save and Exit");
        System.out.println("0. Exit without saving");
    }

    private void showSubMenu(String entityType) {
        System.out.println("\n=== " + entityType.toUpperCase() + " MANAGEMENT ===");
        System.out.println("1. Add " + entityType);
        System.out.println("2. View all " + entityType + "s");
        System.out.println("3. Search " + entityType);
        System.out.println("4. Delete " + entityType);
        System.out.println("0. Back to main menu");
    }

    private void manageStudents() {
        while (true) {
            showSubMenu("Student");
            int choice = InputValidator.getValidInteger(scanner, "Enter your choice: ", 0, 4);
            
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudents();
                case 4 -> deleteStudent();
                case 0 -> { return; }
            }
        }
    }

    private void addStudent() {
        try {
            System.out.println("\n=== ADD NEW STUDENT ===");
            
            Student student = new Student();
            student.setId(InputValidator.getValidInteger(scanner, "Enter ID: ", 1, 999999));
            student.setName(InputValidator.getValidString(scanner, "Enter name: ", false));
            student.setPhone(InputValidator.getValidPhone(scanner, "Enter phone: "));
            student.setAge(InputValidator.getValidInteger(scanner, "Enter age: ", 16, 80));
            student.setCity(InputValidator.getValidString(scanner, "Enter city: ", false));
            student.setGender(InputValidator.getValidGender(scanner, "Enter gender"));
            student.setMajor(InputValidator.getValidString(scanner, "Enter major: ", false));
            student.setYearOfStudy(InputValidator.getValidInteger(scanner, "Enter year of study (1-6): ", 1, 6));
            student.setGrade(InputValidator.getValidString(scanner, "Enter current grade: ", false));
            student.setGpa(InputValidator.getValidDouble(scanner, "Enter GPA (0.0-4.0): ", 0.0, 4.0));
            
            personService.addPerson(student);
            System.out.println("Student added successfully!");
            
        } catch (Exception e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
    }

    private void viewAllStudents() {
        List<Student> students = personService.getAllPersons(Student.class);
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n=== ALL STUDENTS ===");
            students.forEach(System.out::println);
        }
    }

    private void searchStudents() {
        String searchTerm = InputValidator.getValidString(scanner, "Enter search term (name, ID, major): ", false);
        List<Student> students = personService.getAllPersons(Student.class);
        
        students.stream()
            .filter(student -> student.matches(searchTerm))
            .forEach(System.out::println);
    }

    private void deleteStudent() {
        int id = InputValidator.getValidInteger(scanner, "Enter student ID to delete: ", 1, 999999);
        if (personService.deletePerson(Student.class, id)) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void manageWorkers() {
        while (true) {
            showSubMenu("Worker");
            int choice = InputValidator.getValidInteger(scanner, "Enter your choice: ", 0, 4);
            
            switch (choice) {
                case 1 -> addWorker();
                case 2 -> viewAllWorkers();
                case 3 -> searchWorkers();
                case 4 -> deleteWorker();
                case 0 -> { return; }
            }
        }
    }

    private void addWorker() {
        try {
            System.out.println("\n=== ADD NEW WORKER ===");
            
            Worker worker = new Worker();
            worker.setId(InputValidator.getValidInteger(scanner, "Enter ID: ", 1, 999999));
            worker.setName(InputValidator.getValidString(scanner, "Enter name: ", false));
            worker.setPhone(InputValidator.getValidPhone(scanner, "Enter phone: "));
            worker.setAge(InputValidator.getValidInteger(scanner, "Enter age: ", 16, 80));
            worker.setCity(InputValidator.getValidString(scanner, "Enter city: ", false));
            worker.setGender(InputValidator.getValidGender(scanner, "Enter gender"));
            worker.setDepartment(InputValidator.getValidString(scanner, "Enter department: ", false));
            worker.setQualification(InputValidator.getValidString(scanner, "Enter qualification: ", false));
            worker.setSalary(InputValidator.getValidDouble(scanner, "Enter base salary: ", 0, 100000));
            worker.setWorkHours(InputValidator.getValidInteger(scanner, "Enter work hours per week: ", 0, 80));
            worker.setHourlyRate(InputValidator.getValidDouble(scanner, "Enter hourly rate: ", 0, 1000));
            
            personService.addPerson(worker);
            System.out.println("Worker added successfully!");
            
        } catch (Exception e) {
            System.err.println("Error adding worker: " + e.getMessage());
        }
    }

    private void viewAllWorkers() {
        List<Worker> workers = personService.getAllPersons(Worker.class);
        if (workers.isEmpty()) {
            System.out.println("No workers found.");
        } else {
            System.out.println("\n=== ALL WORKERS ===");
            workers.forEach(System.out::println);
        }
    }

    private void searchWorkers() {
        String searchTerm = InputValidator.getValidString(scanner, "Enter search term: ", false);
        List<Worker> workers = personService.getAllPersons(Worker.class);
        
        workers.stream()
            .filter(worker -> worker.matches(searchTerm))
            .forEach(System.out::println);
    }

    private void deleteWorker() {
        int id = InputValidator.getValidInteger(scanner, "Enter worker ID to delete: ", 1, 999999);
        if (personService.deletePerson(Worker.class, id)) {
            System.out.println("Worker deleted successfully!");
        } else {
            System.out.println("Worker not found.");
        }
    }

    // Similar methods for other entity types (Professor, TeachingAssistant, etc.)
    private void manageProfessors() {
        while (true) {
            showSubMenu("Professor");
            int choice = InputValidator.getValidInteger(scanner, "Enter your choice: ", 0, 4);
            
            switch (choice) {
                case 1 -> addProfessor();
                case 2 -> viewAllProfessors();
                case 3 -> searchProfessors();
                case 4 -> deleteProfessor();
                case 0 -> { return; }
            }
        }
    }

    private void addProfessor() {
        try {
            System.out.println("\n=== ADD NEW PROFESSOR ===");
            
            Professor professor = new Professor();
            professor.setId(InputValidator.getValidInteger(scanner, "Enter ID: ", 1, 999999));
            professor.setName(InputValidator.getValidString(scanner, "Enter name: ", false));
            professor.setPhone(InputValidator.getValidPhone(scanner, "Enter phone: "));
            professor.setAge(InputValidator.getValidInteger(scanner, "Enter age: ", 25, 80));
            professor.setCity(InputValidator.getValidString(scanner, "Enter city: ", false));
            professor.setGender(InputValidator.getValidGender(scanner, "Enter gender"));
            professor.setDepartment(InputValidator.getValidString(scanner, "Enter department: ", false));
            professor.setQualification(InputValidator.getValidString(scanner, "Enter qualification: ", false));
            professor.setSalary(InputValidator.getValidDouble(scanner, "Enter base salary: ", 0, 200000));
            professor.setBonus(InputValidator.getValidDouble(scanner, "Enter bonus: ", 0, 50000));
            professor.setAcademicRank(InputValidator.getValidString(scanner, "Enter academic rank: ", false));
            professor.setYearsOfExperience(InputValidator.getValidInteger(scanner, "Enter years of experience: ", 0, 50));
            
            // Add subjects
            while (true) {
                String subject = InputValidator.getValidString(scanner, "Enter subject (or 'done' to finish): ", true);
                if ("done".equalsIgnoreCase(subject)) break;
                professor.addSubject(subject);
            }
            
            personService.addPerson(professor);
            System.out.println("Professor added successfully!");
            
        } catch (Exception e) {
            System.err.println("Error adding professor: " + e.getMessage());
        }
    }

    private void viewAllProfessors() {
        List<Professor> professors = personService.getAllPersons(Professor.class);
        if (professors.isEmpty()) {
            System.out.println("No professors found.");
        } else {
            System.out.println("\n=== ALL PROFESSORS ===");
            professors.forEach(System.out::println);
        }
    }

    private void searchProfessors() {
        String searchTerm = InputValidator.getValidString(scanner, "Enter search term: ", false);
        List<Professor> professors = personService.getAllPersons(Professor.class);
        
        professors.stream()
            .filter(prof -> prof.matches(searchTerm))
            .forEach(System.out::println);
    }

    private void deleteProfessor() {
        int id = InputValidator.getValidInteger(scanner, "Enter professor ID to delete: ", 1, 999999);
        if (personService.deletePerson(Professor.class, id)) {
            System.out.println("Professor deleted successfully!");
        } else {
            System.out.println("Professor not found.");
        }
    }

    // Placeholder methods for other entity management (implement similarly)
    private void manageTeachingAssistants() {
        System.out.println("Teaching Assistant management - Implementation similar to above");
    }

    private void manageAdministrators() {
        System.out.println("Administrator management - Implementation similar to above");
    }

    private void manageSecurity() {
        System.out.println("Security management - Implementation similar to above");
    }

    private void manageTechnicians() {
        System.out.println("Technician management - Implementation similar to above");
    }

    private void searchPerson() {
        String searchTerm = InputValidator.getValidString(scanner, "Enter search term (name, ID, etc.): ", false);
        List<Person> results = personService.searchByTerm(searchTerm);
        
        if (results.isEmpty()) {
            System.out.println("No persons found matching: " + searchTerm);
        } else {
            System.out.println("\n=== SEARCH RESULTS ===");
            results.forEach(System.out::println);
        }
    }

    private void showStatistics() {
        System.out.println("\n=== FACULTY STATISTICS ===");
        Map<String, Integer> stats = personService.getStatistics();
        
        stats.forEach((key, value) -> 
            System.out.printf("%-20s: %d\n", key, value));
        
        // Calculate salary statistics for employees
        List<Person> allPersons = personService.getAllPersons();
        double totalSalaries = allPersons.stream()
            .filter(person -> person instanceof Payable)
            .mapToDouble(person -> ((Payable) person).calculateSalary())
            .sum();
        
        System.out.printf("%-20s: $%.2f\n", "Total Salaries", totalSalaries);
    }

    private void saveAndExit() {
        fileService.saveAllData(personService);
        System.out.println("Data saved successfully. Goodbye!");
        System.exit(0);
    }

    private void exit() {
        System.out.println("Are you sure you want to exit without saving? (y/n)");
        String confirm = scanner.nextLine().trim().toLowerCase();
        if (confirm.equals("y") || confirm.equals("yes")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new FacultyManagementSystem().start();
    }
}