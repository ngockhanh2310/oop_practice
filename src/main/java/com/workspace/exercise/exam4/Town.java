package com.workspace.exercise.exam4;

import java.util.List;
import java.util.Scanner;

public class Town {
    private List<Family> families; // list of families in the town

    public Town() {
        this.families = new java.util.ArrayList<>();
    }

    // Kiểm tra xem số nhà đã tồn tại trong thị trấn chưa
    public boolean isHouseNumberExist(String houseNumber) {
        for (Family f : families) {
            if (houseNumber.equals(f.getHouseNumber())) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        if (families.isEmpty()) {
            System.out.println(".--------------------------------.");
            System.out.println("|    No families in the town.    |");
            System.out.println(".--------------------------------.");
            return;
        }
        System.out.println("==== Town Information ====");
        for (Family f : families) {
            f.display();
            System.out.println();
        }
    }

    public void addTown(Scanner scanner) {
        System.out.print("Enter the number of families: ");
        int numberOfFamilies;
        try {
            numberOfFamilies = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Defaulting to 0.");
            numberOfFamilies = 0;
        }

        for (int i = 0; i < numberOfFamilies; i++) {
            System.out.println("Enter information for family " + (i + 1) + ":");
            Family family = new Family();

            // --- Thêm logic nhập và xác thực số nhà ---
            String houseNumber;
            while (true) {
                System.out.print("Enter house number: ");
                houseNumber = scanner.nextLine();
                if (isHouseNumberExist(houseNumber)) {
                    System.out.println("House number already exists. Please enter again.");
                } else if (houseNumber.trim().isEmpty()) {
                    System.out.println("House number cannot be empty. Please enter again.");
                } else {
                    family.setHouseNumber(houseNumber); // Đặt số nhà hợp lệ
                    break; // Thoát vòng lặp
                }
            }
            // --- Kết thúc logic xác thực số nhà ---

            // Gọi phương thức mới để chỉ thêm thành viên
            family.addFamilyMembers(scanner);
            families.add(family);
        }
    }
}
