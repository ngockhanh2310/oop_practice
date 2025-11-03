package com.workspace.exercise.exam9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        int choice;
        do {
            System.out.println("1. Add new client");
            System.out.println("2. Display all client");
            System.out.println("3. Delete client");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    manage.addReceipt(scanner);
                    break;
                case 2:
                    manage.display();
                    break;
                case 3:
                    System.out.println("Enter code to delete: ");
                    String code = scanner.next();
                    manage.deleteReceipt(code);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}
