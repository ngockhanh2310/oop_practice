package com.workspace.exercise.exam8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardManage cardManage = new CardManage();
        int choice;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Add Card Library");
            System.out.println("2. Display Card Library");
            System.out.println("3. Delete Card Library");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    cardManage.addCardLibrary(sc);
                    break;
                case 2:
                    if (cardManage.getCardLibraries().isEmpty()) {
                        System.out.println("Card Library is empty!");
                        break;
                    }
                    cardManage.display();
                    break;
                case 3:
                    if (cardManage.getCardLibraries().isEmpty()) {
                        System.out.println("Card Library is empty!");
                        break;
                    }
                    System.out.println("Enter ID Card to delete:");
                    String idCard = sc.nextLine();
                    if (cardManage.checkIdCard(idCard)) {
                        cardManage.deleteCardLibrary(idCard);
                        System.out.println("Card Library deleted successfully!");
                    } else {
                        System.out.println("ID Card not found!");
                        break;
                    }
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}
