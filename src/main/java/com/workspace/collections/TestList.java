package com.workspace.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestList {
    private List<Student> students;

    public TestList() {
        students = new ArrayList<>();
    }

    public void menu() {
        System.out.println("------MENU------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Xóa những tên bắt đầu bằng chữ “A”");
        System.out.println("4. Danh sách đảo ngược");
        System.out.println("5. Thoát");
        System.out.println("-----------------");
    }

    // Thêm sinh viên
    public void addStudent(Scanner scanner) {
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        System.out.print("Nhập lớp sinh viên: ");
        String className = scanner.nextLine();
        students.add(new Student(name, age, address, className));
        System.out.println("Thêm sinh viên thành công!");
    }

    // Hiển thị danh sách sinh viên
    public void displayStudents() {
        if(students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }
        System.out.println("Danh sách sinh viên");
        students.stream().forEach(student -> System.out.println(student.toString()));
    }

    // Xóa những tên bắt đầu bằng chữ “A”
    public void removeStudentsBeginWithA() {
        boolean removed = students.removeIf(student -> student.getName().startsWith("A"));
        if (removed) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không có sinh viên nào có tên bắt đầu bằng chữ A!");
        }
    }

    // Danh sách đảo ngược
    public void reverseStudents() {
        // Chỉ sử dụng stream để hiển thị danh sách sinh viên đảo ngược
        students.reversed().stream().forEach(student -> System.out.println(student.toString()));
        // Dùng Collections.reverse() để đảo ngược hoàn toàn danh sách sinh viên
        /*Collections.reverse(students);
        System.out.println("Đã đảo ngược danh sách sinh viên thành công!");
        displayStudents();*/ // Hiển thị lại danh sách sau khi đảo ngược
    }
}
