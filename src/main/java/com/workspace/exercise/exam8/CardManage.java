package com.workspace.exercise.exam8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardManage {
    private List<CardLibrary> cardLibraries;

    public CardManage() {
        this.cardLibraries = new ArrayList<>();
    }

    public List<CardLibrary> getCardLibraries() {
        return cardLibraries;
    }

    public void setCardLibraries(List<CardLibrary> cardLibraries) {
        this.cardLibraries = cardLibraries;
    }

    public boolean checkIdCard(String idCard) {
        for (CardLibrary cardLibrary : cardLibraries) {
            if (cardLibrary.getIdCard().equals(idCard)) {
                return true;
            }
        }
        return false;
    }

    public void addCardLibrary(Scanner scanner) {
        String idCard;
        System.out.println("Enter ID Card:");
        idCard = scanner.nextLine();
        boolean check = false;
        while (!check) {
            if (checkIdCard(idCard)) {
                System.out.println("ID Card already exists");
                System.out.println("Enter ID Card:");
                idCard = scanner.nextLine();
            } else {
                check = true;
            }
        }
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Class Name:");
        String className = scanner.nextLine();
        System.out.println("Enter Bookstore Number:");
        int bookstoreNumber = scanner.nextInt();
        scanner.nextLine();
        var cardLibrary = new CardLibrary(name, age, className, idCard, bookstoreNumber);
        cardLibraries.add(cardLibrary);
    }

    public void display() {
        for (CardLibrary cardLibrary : cardLibraries) {
            cardLibrary.display();
        }
    }

    public boolean deleteCardLibrary(String idCard) {
        if (checkIdCard(idCard)) {
            cardLibraries.removeIf(card -> card.getIdCard().equals(idCard));
            return true;
        } else {
            return false;
        }
    }
}
