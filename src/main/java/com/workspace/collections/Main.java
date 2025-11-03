package com.workspace.collections;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        TestList testList = new TestList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            testList.menu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    testList.addStudent(scanner);
                    break;
                case 2:
                    testList.displayStudents();
                    break;
                case 3:
                    testList.removeStudentsBeginWithA();
                    break;
                case 4:
                    testList.reverseStudents();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (choice != 5);
        scanner.close();;     
    }
}
