# Faculty Management System - Improved Version

## Overview
This is a complete, improved implementation of a Faculty Management System built with Java, demonstrating advanced Object-Oriented Programming principles and best practices.

## Features

### Core Functionality
- **Person Management**: Students, Workers, Professors, Teaching Assistants, Administrators, Security, Technicians
- **CRUD Operations**: Create, Read, Update, Delete for all person types
- **Search Functionality**: Search by name, ID, or other attributes
- **Data Persistence**: Save/Load data to/from files
- **Statistics**: View faculty statistics and salary calculations

### OOP Principles Demonstrated

#### 1. Inheritance
- `Person` (Abstract base class)
  - `Student` extends `Person`
  - `Employee` (Abstract) extends `Person`
    - `Worker` extends `Employee`
    - `Professor` extends `Employee`
    - `TeachingAssistant` extends `Professor`
    - `Administrator` extends `Employee`
    - `Security` extends `Employee`
    - `Technician` extends `Employee`

#### 2. Interfaces
- `Payable` - For salary calculations
- `Searchable` - For search functionality

#### 3. Polymorphism
- Method overriding (`toString()`, `calculateSalary()`)
- Interface implementation
- Dynamic method dispatch

#### 4. Encapsulation
- Private fields with public getters/setters
- Input validation in setters
- Data hiding

#### 5. Abstraction
- Abstract classes (`Person`, `Employee`)
- Interface definitions
- Service layer abstraction

## Project Structure

```
improved_src/
├── interfaces/
│   ├── Payable.java
│   └── Searchable.java
├── model/
│   ├── Person.java (Abstract)
│   ├── Student.java
│   ├── Employee.java (Abstract)
│   ├── Worker.java
│   ├── Professor.java
│   ├── TeachingAssistant.java
│   ├── Administrator.java
│   ├── Security.java
│   └── Technician.java
├── service/
│   ├── PersonService.java
│   └── FileService.java
├── util/
│   └── InputValidator.java
├── FacultyManagementSystem.java (Main class)
└── README.md
```

## Key Improvements Over Original

### 1. **Better Architecture**
- Service layer for business logic
- Utility classes for common operations
- Separation of concerns

### 2. **Enhanced Error Handling**
- Input validation
- Exception handling
- User-friendly error messages

### 3. **Consistent Design**
- All person types extend `Person`
- Consistent naming conventions
- Proper Java coding standards

### 4. **Advanced Features**
- File persistence
- Search functionality
- Statistics and reporting
- Salary calculations with bonuses

### 5. **User Experience**
- Improved menu system
- Input validation
- Clear formatting
- Help messages

## How to Run

### Prerequisites
- Java 11 or higher
- Any Java IDE or command line

### Compilation and Execution

```bash
# Navigate to the improved_src directory
cd improved_src

# Compile all Java files
javac -cp . *.java model/*.java service/*.java util/*.java interfaces/*.java

# Run the main application
java FacultyManagementSystem
```

### Using the System

1. **Main Menu**: Choose the type of person to manage
2. **Sub Menus**: Add, view, search, or delete records
3. **Search**: Global search across all person types
4. **Statistics**: View faculty statistics and salary totals
5. **Save/Load**: Data is automatically saved to files

## Data Persistence

The system saves data to text files in a `data/` directory:
- `students.txt`
- `workers.txt`
- `professors.txt`
- `teaching_assistants.txt`
- `administrators.txt`
- `security.txt`
- `technicians.txt`

## Example Usage

### Adding a Student
1. Select "Manage Students" from main menu
2. Choose "Add Student"
3. Enter required information (ID, name, phone, etc.)
4. Student is added to the system

### Searching
1. Select "Search Person" from main menu
2. Enter search term (name, ID, department, etc.)
3. View matching results across all person types

### Viewing Statistics
1. Select "Show Statistics" from main menu
2. View counts for each person type
3. View total salary calculations

## Class Relationships

```
Person (Abstract)
├── implements Searchable
├── Student
└── Employee (Abstract)
    ├── implements Payable
    ├── Worker
    ├── Professor
    │   └── TeachingAssistant
    ├── Administrator
    ├── Security
    └── Technician
```

## Future Enhancements

- Database integration (MySQL, PostgreSQL)
- GUI interface (JavaFX or Swing)
- RESTful API
- Advanced reporting
- User authentication
- Backup and restore functionality

## Authors
- Original concept by Group 2 team members
- Improved implementation with modern Java practices and design patterns

This improved version demonstrates professional-level Java development with proper OOP design, error handling, and user experience considerations.