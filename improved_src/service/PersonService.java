package service;

import model.*;
import interfaces.Searchable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Service class for managing all person-related operations
 */
public class PersonService {
    private Map<Class<?>, List<? extends Person>> personLists;
    
    @SuppressWarnings("unchecked")
    public PersonService() {
        personLists = new HashMap<>();
        personLists.put(Student.class, new ArrayList<Student>());
        personLists.put(Worker.class, new ArrayList<Worker>());
        personLists.put(Professor.class, new ArrayList<Professor>());
        personLists.put(TeachingAssistant.class, new ArrayList<TeachingAssistant>());
        personLists.put(Administrator.class, new ArrayList<Administrator>());
        personLists.put(Security.class, new ArrayList<Security>());
        personLists.put(Technician.class, new ArrayList<Technician>());
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Person> void addPerson(T person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        
        // Check for duplicate ID
        if (findById(person.getId()) != null) {
            throw new IllegalArgumentException("Person with ID " + person.getId() + " already exists");
        }
        
        List<T> list = (List<T>) personLists.get(person.getClass());
        if (list != null) {
            list.add(person);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Person> List<T> getAllPersons(Class<T> clazz) {
        List<T> list = (List<T>) personLists.get(clazz);
        return list != null ? new ArrayList<>(list) : new ArrayList<>();
    }
    
    public Person findById(int id) {
        for (List<? extends Person> list : personLists.values()) {
            for (Person person : list) {
                if (person.getId() == id) {
                    return person;
                }
            }
        }
        return null;
    }
    
    public List<Person> searchByTerm(String searchTerm) {
        List<Person> results = new ArrayList<>();
        for (List<? extends Person> list : personLists.values()) {
            for (Person person : list) {
                if (person.matches(searchTerm)) {
                    results.add(person);
                }
            }
        }
        return results;
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Person> boolean deletePerson(Class<T> clazz, int id) {
        List<T> list = (List<T>) personLists.get(clazz);
        if (list != null) {
            return list.removeIf(person -> person.getId() == id);
        }
        return false;
    }
    
    public boolean deletePersonById(int id) {
        for (List<? extends Person> list : personLists.values()) {
            if (list.removeIf(person -> person.getId() == id)) {
                return true;
            }
        }
        return false;
    }
    
    public Map<String, Integer> getStatistics() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("Students", getAllPersons(Student.class).size());
        stats.put("Workers", getAllPersons(Worker.class).size());
        stats.put("Professors", getAllPersons(Professor.class).size());
        stats.put("Teaching Assistants", getAllPersons(TeachingAssistant.class).size());
        stats.put("Administrators", getAllPersons(Administrator.class).size());
        stats.put("Security", getAllPersons(Security.class).size());
        stats.put("Technicians", getAllPersons(Technician.class).size());
        
        int total = stats.values().stream().mapToInt(Integer::intValue).sum();
        stats.put("Total", total);
        
        return stats;
    }
    
    public List<Person> getAllPersons() {
        List<Person> allPersons = new ArrayList<>();
        for (List<? extends Person> list : personLists.values()) {
            allPersons.addAll(list);
        }
        return allPersons;
    }
}