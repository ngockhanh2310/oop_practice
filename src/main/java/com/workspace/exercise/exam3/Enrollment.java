package com.workspace.exercise.exam3;

import java.util.ArrayList;
import java.util.Scanner;

public class Enrollment {
    private ArrayList<Candidate> candidates;

    public Enrollment() {
        this.candidates = new ArrayList<>();
    }

    public boolean checkCandidateExists(int candidateId) {
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId() == candidateId) {
                return true;
            }
        }
        return false;
    }

    public void addCandidate() {
        System.out.println("Select Candidate Block to Add:");
        System.out.println("1.Block A");
        System.out.println("2.Block B");
        System.out.println("3.Block C");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Candidate ID: ");
        int candidateId = scanner.nextInt();
        scanner.nextLine();
        if (checkCandidateExists(candidateId)) {
            System.out.println("Candidate ID already exists.");
            return;
        }
        switch (choice) {
            case 1:
                System.out.print("Enter Candidate Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Candidate Address: ");
                String address = scanner.nextLine();
                System.out.print("Enter Candidate Priority Level (1-10): ");
                int priorityLevel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Math Score: ");
                double mathScore = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Physics Score: ");
                double physicsScore = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Chemistry Score: ");
                double chemistryScore = scanner.nextDouble();
                scanner.nextLine();
                candidates.add(new BlockA().builder()
                        .candidateId(candidateId)
                        .name(name)
                        .address(address)
                        .priorityLevel(priorityLevel)
                        .mathScore(mathScore)
                        .physicsScore(physicsScore)
                        .chemistryScore(chemistryScore)
                        .build());
                System.out.println("Block A Candidate added successfully.");
                break;
            case 2:
                System.out.print("Enter Candidate Name: ");
                name = scanner.nextLine();
                System.out.print("Enter Candidate Address: ");
                address = scanner.nextLine();
                System.out.print("Enter Candidate Priority Level: ");
                priorityLevel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Math Score: ");
                double mathScoreA = scanner.nextDouble();
                System.out.println("Enter Biology Score: ");
                double biologyScore = scanner.nextDouble();
                System.out.println("Enter Chemistry Score: ");
                double chemistryScoreB = scanner.nextDouble();
                scanner.nextLine();
                candidates.add(new BlockB().builder()
                        .candidateId(candidateId)
                        .name(name)
                        .address(address)
                        .priorityLevel(priorityLevel)
                        .mathScore(mathScoreA)
                        .biologyScore(biologyScore)
                        .chemistryScore(chemistryScoreB)
                        .build());

                System.out.println("Block B Candidate added successfully.");
                break;
            case 3:
                System.out.print("Enter Candidate Name: ");
                name = scanner.nextLine();
                System.out.print("Enter Candidate Address: ");
                address = scanner.nextLine();
                System.out.print("Enter Candidate Priority Level: ");
                priorityLevel = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Literature Score: ");
                double literatureScore = scanner.nextDouble();
                System.out.println("Enter History Score: ");
                double historyScore = scanner.nextDouble();
                System.out.println("Enter Geography Score: ");
                double geographyScore = scanner.nextDouble();
                scanner.nextLine();
                candidates.add(new BlockC().builder()
                        .candidateId(candidateId)
                        .name(name)
                        .address(address)
                        .priorityLevel(priorityLevel)
                        .literatureScore(literatureScore)
                        .historyScore(historyScore)
                        .geographyScore(geographyScore)
                        .build());

                System.out.println("Block C Candidate added successfully.");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

    }

    public void displayAllCandidates() {
        if (candidates.isEmpty()) {
            System.out.println("No candidates to display.");
            return;
        }
        for (Candidate candidate : candidates) {
            candidate.display();
            System.out.println("-----------------------");
        }
    }

    public void displayCandidatesByPriorityLevel(int priorityLevel) {
        for (Candidate candidate : candidates) {
            if (candidate.getPriorityLevel() == priorityLevel) {
                candidate.display();
                System.out.println("-----------------------");
            }
        }
    }

    public void findCandidateById(int candidateId) {
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId() == candidateId) {
                candidate.display();
                return;
            }
        }
        System.out.println("Candidate with ID " + candidateId + " not found.");
    }
}
