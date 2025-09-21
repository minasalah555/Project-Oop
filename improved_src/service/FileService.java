package service;

import model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class for file operations (save/load data)
 */
public class FileService {
    private static final String DATA_DIRECTORY = "data/";
    private static final String STUDENTS_FILE = DATA_DIRECTORY + "students.txt";
    private static final String WORKERS_FILE = DATA_DIRECTORY + "workers.txt";
    private static final String PROFESSORS_FILE = DATA_DIRECTORY + "professors.txt";
    private static final String TAS_FILE = DATA_DIRECTORY + "teaching_assistants.txt";
    private static final String ADMINS_FILE = DATA_DIRECTORY + "administrators.txt";
    private static final String SECURITY_FILE = DATA_DIRECTORY + "security.txt";
    private static final String TECHNICIANS_FILE = DATA_DIRECTORY + "technicians.txt";
    
    public FileService() {
        createDataDirectory();
    }
    
    private void createDataDirectory() {
        File directory = new File(DATA_DIRECTORY);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }
    
    public void saveAllData(PersonService personService) {
        try {
            saveStudents(personService.getAllPersons(Student.class));
            saveWorkers(personService.getAllPersons(Worker.class));
            saveProfessors(personService.getAllPersons(Professor.class));
            saveTeachingAssistants(personService.getAllPersons(TeachingAssistant.class));
            saveAdministrators(personService.getAllPersons(Administrator.class));
            saveSecurity(personService.getAllPersons(Security.class));
            saveTechnicians(personService.getAllPersons(Technician.class));
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }
    
    public void loadAllData(PersonService personService) {
        try {
            loadStudents(personService);
            loadWorkers(personService);
            loadProfessors(personService);
            loadTeachingAssistants(personService);
            loadAdministrators(personService);
            loadSecurity(personService);
            loadTechnicians(personService);
            System.out.println("Data loaded successfully!");
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
    
    private void saveStudents(List<Student> students) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(STUDENTS_FILE))) {
            for (Student student : students) {
                writer.println(String.format("%d|%s|%s|%d|%s|%s|%s|%.2f|%s|%d",
                    student.getId(), student.getName(), student.getPhone(),
                    student.getAge(), student.getCity(), student.getGender(),
                    student.getGrade(), student.getGpa(), student.getMajor(),
                    student.getYearOfStudy()));
            }
        }
    }
    
    private void loadStudents(PersonService personService) throws IOException {
        File file = new File(STUDENTS_FILE);
        if (!file.exists()) return;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 10) {
                    Student student = new Student();
                    student.setId(Integer.parseInt(parts[0]));
                    student.setName(parts[1]);
                    student.setPhone(parts[2]);
                    student.setAge(Integer.parseInt(parts[3]));
                    student.setCity(parts[4]);
                    student.setGender(parts[5]);
                    student.setGrade(parts[6]);
                    student.setGpa(Double.parseDouble(parts[7]));
                    student.setMajor(parts[8]);
                    student.setYearOfStudy(Integer.parseInt(parts[9]));
                    personService.addPerson(student);
                }
            }
        }
    }
    
    private void saveWorkers(List<Worker> workers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(WORKERS_FILE))) {
            for (Worker worker : workers) {
                writer.println(String.format("%d|%s|%s|%d|%s|%s|%.2f|%s|%s|%d|%.2f",
                    worker.getId(), worker.getName(), worker.getPhone(),
                    worker.getAge(), worker.getCity(), worker.getGender(),
                    worker.getSalary(), worker.getDepartment(), worker.getQualification(),
                    worker.getWorkHours(), worker.getHourlyRate()));
            }
        }
    }
    
    private void loadWorkers(PersonService personService) throws IOException {
        File file = new File(WORKERS_FILE);
        if (!file.exists()) return;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 11) {
                    Worker worker = new Worker();
                    worker.setId(Integer.parseInt(parts[0]));
                    worker.setName(parts[1]);
                    worker.setPhone(parts[2]);
                    worker.setAge(Integer.parseInt(parts[3]));
                    worker.setCity(parts[4]);
                    worker.setGender(parts[5]);
                    worker.setSalary(Double.parseDouble(parts[6]));
                    worker.setDepartment(parts[7]);
                    worker.setQualification(parts[8]);
                    worker.setWorkHours(Integer.parseInt(parts[9]));
                    worker.setHourlyRate(Double.parseDouble(parts[10]));
                    personService.addPerson(worker);
                }
            }
        }
    }
    
    // Similar methods for other classes (simplified for brevity)
    private void saveProfessors(List<Professor> professors) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PROFESSORS_FILE))) {
            for (Professor prof : professors) {
                writer.println(String.format("%d|%s|%s|%d|%s|%s|%.2f|%s|%s|%.2f|%s|%d",
                    prof.getId(), prof.getName(), prof.getPhone(),
                    prof.getAge(), prof.getCity(), prof.getGender(),
                    prof.getSalary(), prof.getDepartment(), prof.getQualification(),
                    prof.getBonus(), prof.getAcademicRank(), prof.getYearsOfExperience()));
            }
        }
    }
    
    private void loadProfessors(PersonService personService) throws IOException {
        File file = new File(PROFESSORS_FILE);
        if (!file.exists()) return;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 12) {
                    Professor prof = new Professor();
                    prof.setId(Integer.parseInt(parts[0]));
                    prof.setName(parts[1]);
                    prof.setPhone(parts[2]);
                    prof.setAge(Integer.parseInt(parts[3]));
                    prof.setCity(parts[4]);
                    prof.setGender(parts[5]);
                    prof.setSalary(Double.parseDouble(parts[6]));
                    prof.setDepartment(parts[7]);
                    prof.setQualification(parts[8]);
                    prof.setBonus(Double.parseDouble(parts[9]));
                    prof.setAcademicRank(parts[10]);
                    prof.setYearsOfExperience(Integer.parseInt(parts[11]));
                    personService.addPerson(prof);
                }
            }
        }
    }
    
    // Placeholder methods for other classes (implement similarly)
    private void saveTeachingAssistants(List<TeachingAssistant> tas) throws IOException {
        // Implementation similar to above
    }
    
    private void loadTeachingAssistants(PersonService personService) throws IOException {
        // Implementation similar to above
    }
    
    private void saveAdministrators(List<Administrator> admins) throws IOException {
        // Implementation similar to above
    }
    
    private void loadAdministrators(PersonService personService) throws IOException {
        // Implementation similar to above
    }
    
    private void saveSecurity(List<Security> security) throws IOException {
        // Implementation similar to above
    }
    
    private void loadSecurity(PersonService personService) throws IOException {
        // Implementation similar to above
    }
    
    private void saveTechnicians(List<Technician> technicians) throws IOException {
        // Implementation similar to above
    }
    
    private void loadTechnicians(PersonService personService) throws IOException {
        // Implementation similar to above
    }
}