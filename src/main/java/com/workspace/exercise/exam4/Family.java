package com.workspace.exercise.exam4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {
    private int familyMembers; // number of family members
    private String houseNumber; // number of houses
    private List<Person> person; // list of family members

    public Family() {
        person = new ArrayList<>();
    }

    public Family(int familyMembers, String houseNumber, List<Person> person) {
        this.familyMembers = familyMembers;
        this.houseNumber = houseNumber;
        this.person = person;
    }

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public void display() {
        System.out.println("---- Family Information ----");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Family Members Details:");
        for (Person p : person) {
            p.display();
            System.out.println();
        }
    }

    /**
     * Chỉ thêm các thành viên vào gia đình.
     * Việc nhập và kiểm tra số nhà được thực hiện ở lớp Town.
     */
    public void addFamilyMembers(Scanner scanner) {
        // Input number of family members
        System.out.print("Enter number of family members: ");
        this.familyMembers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < familyMembers; i++) {
            System.out.println("Enter information for family member " + (i + 1) + ":");
            Person p = new Person();

            // Vòng lặp để đảm bảo ID không trùng lặp TRONG gia đình này
            while (true) {
                p.addInfoPerson(scanner); // Yêu cầu nhập thông tin

                if (isIdCardExist(p.getIdCard())) { // Kiểm tra ID
                    System.out.println("Id card already exists in this family, please enter again.");
                } else {
                    break; // ID hợp lệ, thoát vòng lặp
                }
            }
            this.person.add(p); // Thêm người đã được xác thực vào danh sách
        }
    }

    // Check if ID card exists in this family
    private boolean isIdCardExist(String idCard) {
        if (idCard == null || idCard.trim().isEmpty()) {
            return false;
        }
        for (Person p : this.person) {
            if (idCard.equals(p.getIdCard())) {
                return true;
            }
        }
        return false;
    }

    // Phương thức isHouseNumberExist đã bị xóa vì nó thuộc về lớp Town
}
