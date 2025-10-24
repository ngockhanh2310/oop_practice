package com.workspace.exercise.exam4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Town town = new Town();
        int option = 0; // Khởi tạo giá trị

        do {
            System.out.println("---- Application Town Management ----");
            System.out.println("1. Add town");
            System.out.println("2. Display town");
            System.out.println("3. Exit");
            System.out.print("Enter options: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                option = 0; // Đặt lại tùy chọn về giá trị không hợp lệ để lặp lại
            }

            switch (option) {
                case 1: {
                    town.addTown(scanner);
                    break;
                }
                case 2: {
                    town.display();
                    break;
                }
                case 3: {
                    System.out.println("Exiting the application.");
                    break;
                }
                default: {
                    // Chỉ thông báo lỗi nếu người dùng không chọn thoát
                    if (option != 0) { // 0 là trường hợp lỗi (catch)
                        System.out.println("Invalid option. Please try again.");
                    }
                    break;
                }
            }
            System.out.println(); // Thêm một dòng trống để dễ đọc
        } while (option != 3);

        scanner.close(); // Đóng scanner khi kết thúc
    }
}