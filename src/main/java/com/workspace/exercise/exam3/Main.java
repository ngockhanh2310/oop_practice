package com.workspace.exercise.exam3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Candidate Enrollment System ---");
            System.out.println("1. Add Candidate");
            System.out.println("2. Display All Candidates");
            System.out.println("3. Find Candidate by ID");
            System.out.println("4. Display Candidates by Priority Level");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    enrollment.addCandidate();
                    break;
                case 2:
                    enrollment.displayAllCandidates();
                    break;
                case 3:
                    System.out.print("Enter Candidate ID: ");
                    int candidateId = scanner.nextInt();
                    enrollment.findCandidateById(candidateId);
                    break;
                case 4:
                    System.out.print("Enter Priority Level: ");
                    int priorityLevel = scanner.nextInt();
                    enrollment.displayCandidatesByPriorityLevel(priorityLevel);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
