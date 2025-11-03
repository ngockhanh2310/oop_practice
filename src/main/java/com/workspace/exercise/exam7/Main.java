package com.workspace.exercise.exam7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManage teacherManage = new TeacherManage();

        int choice;
        do {
            System.out.println("--- Teacher Management System ---");
            System.out.println("1. Add Teacher");
            System.out.println("2. Display Teacher");
            System.out.println("3. Delete Teacher");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    teacherManage.addTeacher(scanner);
                    break;
                case 2:
                    if (teacherManage.getTeachers().isEmpty()) {
                        System.out.println("No teachers to display.");
                    } else {
                        teacherManage.display();
                    }
                    break;
                case 3:
                    if (teacherManage.getTeachers().isEmpty()) {
                        System.out.println("No teachers to delete.");
                    } else {
                        int id;
                        System.out.println("Enter id to delete: ");
                        id = scanner.nextInt();
                        if (teacherManage.deleteTeacher(id)) {
                            System.out.println("Teacher deleted successfully.");
                        } else {
                            System.out.println("Teacher not found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
