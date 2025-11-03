package com.workspace.exercise.exam8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CardLibrary extends Student {
    private String idCard;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpiry;
    private int bookstoreNumber;
    
    public CardLibrary(String name, int age, String className, String idCard, int bookstoreNumber) {
        super(name, age, className);
        this.idCard = idCard;
        this.dateOfIssue = LocalDate.now();
        this.dateOfExpiry = LocalDate.now().plusMonths(3);
        this.bookstoreNumber = bookstoreNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public int getBookstoreNumber() {
        return bookstoreNumber;
    }

    public void setBookstoreNumber(int bookstoreNumber) {
        this.bookstoreNumber = bookstoreNumber;
    }

    @Override
    public void display() {
        System.out.println("\t\r---Card Library Information---");
        super.display();
        System.out.println("ID Card: " + idCard);
        System.out.println("Date of Issue: " + dateOfIssue.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Date of Expiry: " + dateOfExpiry.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Bookstore Number: " + bookstoreNumber);
    }   
}
