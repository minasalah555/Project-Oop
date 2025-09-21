package util;

import java.util.Scanner;

/**
 * Utility class for input validation
 */
public class InputValidator {
    
    public static int getValidInteger(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Please enter a number between %d and %d.\n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
    
    public static double getValidDouble(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Double.parseDouble(scanner.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Please enter a number between %.2f and %.2f.\n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
    
    public static String getValidString(Scanner scanner, String prompt, boolean allowEmpty) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine().trim();
            if (!value.isEmpty() || allowEmpty) {
                return value;
            } else {
                System.out.println("This field cannot be empty.");
            }
        }
    }
    
    public static String getValidPhone(Scanner scanner, String prompt) {
        String phone;
        while (true) {
            System.out.print(prompt);
            phone = scanner.nextLine().trim();
            if (phone.matches("\\d{10,15}")) {
                return phone;
            } else {
                System.out.println("Please enter a valid phone number (10-15 digits).");
            }
        }
    }
    
    public static String getValidEmail(Scanner scanner, String prompt) {
        String email;
        while (true) {
            System.out.print(prompt);
            email = scanner.nextLine().trim();
            if (email.contains("@") && email.contains(".") && email.length() > 5) {
                return email;
            } else {
                System.out.println("Please enter a valid email address.");
            }
        }
    }
    
    public static String getValidGender(Scanner scanner, String prompt) {
        String gender;
        while (true) {
            System.out.print(prompt + " (Male/Female): ");
            gender = scanner.nextLine().trim();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                return gender;
            } else {
                System.out.println("Please enter 'Male' or 'Female'.");
            }
        }
    }
}