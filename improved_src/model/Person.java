package model;

import interfaces.Searchable;

/**
 * Abstract base class representing a person in the faculty
 */
public abstract class Person implements Searchable {
    protected String name;
    protected String phone;
    protected int age;
    protected String city;
    protected int id;
    protected String gender;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(String name, String phone, int age, String city, int id, String gender) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.id = id;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{10,15}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone number must be 10-15 digits");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 80) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 16 and 80");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be positive");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be 'Male' or 'Female'");
        }
    }

    // Searchable interface implementation
    @Override
    public boolean matches(String searchTerm) {
        return name.toLowerCase().contains(searchTerm.toLowerCase()) ||
               String.valueOf(id).contains(searchTerm);
    }

    // Abstract methods
    public abstract String toString();
    
    // Equals and hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}