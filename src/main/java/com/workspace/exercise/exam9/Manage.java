package com.workspace.exercise.exam9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    private List<Receipt> receipts;

    public Manage() {
        receipts = new ArrayList<>();
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public void addReceipt(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter code: ");
        String code = scanner.nextLine();
        System.out.print("Enter old code: ");
        int oldCode = scanner.nextInt();
        System.out.print("Enter new code: ");
        int newCode = scanner.nextInt();
        int cost = payable(oldCode, newCode);
        Receipt receipt = new Receipt(name, address, code, oldCode, newCode, cost);
        receipts.add(receipt);
        System.out.println("Receipt added successfully!");
    }

    public int payable(int oldCode, int newCode) {
        return (newCode - oldCode) * 5;
    }

    public void display() {
        receipts.forEach((receipt) -> System.out.println(receipt.toString()));
    }

    public void deleteReceipt(String code) {
        receipts.removeIf(receipt -> receipt.getCode().equals(code));
        System.out.println("Receipt deleted successfully!");
    }
}
