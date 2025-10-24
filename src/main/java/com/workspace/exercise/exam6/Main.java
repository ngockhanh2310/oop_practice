package com.workspace.exercise.exam6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        System.out.println("--- School Management System ---");
        System.out.println("1. Add student");
        System.out.println("2. Display student");
        System.out.println("3. Check for student aged 20");
        System.out.println("4. Count students aged 23 from Vietnam");
        System.out.println("5. Exit");
        int choice;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                choice = 0;
                return;
            }
            switch (choice) {
                case 1:
                    school.addStudent(scanner);
                    break; 
                case 2:
                    school.display();
                    break;
                case 3:
                    if (school.getStudentAge()) {
                        System.out.println("There is at least one student aged 20.");
                    } else {
                        System.out.println("There are no students aged 20.");
                    }
                    break;
                case 4:
                    int count = school.countStudentsFromCountry();
                    System.out.println("Number of students aged 23 from Vietnam: " + count);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}
