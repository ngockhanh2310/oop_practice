package com.workspace.exercise.exam5;
import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;
    private String idCardNumber; // Was: soCMND

    // Constructors
    public Person() {
    }

    public Person(String fullName, int age, String idCardNumber) {
        this.fullName = fullName;
        this.age = age;
        this.idCardNumber = idCardNumber;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    // Method to input information
    public void inputInfo(Scanner scanner) {
        System.out.print("Enter full name: ");
        this.fullName = scanner.nextLine();

        // Safe age input
        while (true) {
            try {
                System.out.print("Enter age: ");
                this.age = Integer.parseInt(scanner.nextLine());
                if (this.age > 0) {
                    break;
                } else {
                    System.out.println("Age must be a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for age.");
            }
        }

        System.out.print("Enter ID Card Number: ");
        this.idCardNumber = scanner.nextLine();
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("  - Full Name: " + fullName);
        System.out.println("  - Age: " + age);
        System.out.println("  - ID Card Number: " + idCardNumber);
    }
}
