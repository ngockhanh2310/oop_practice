package com.workspace.exercise.exam7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherManage {
    private List<Teacher> teachers;

    public TeacherManage() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public boolean checkId(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void addTeacher(Scanner scanner) {
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        boolean exists = false; // check id exists
        while (!exists) {
            if (checkId(id)) {
                System.out.println("Id already exists");
                System.out.println("Enter id: ");
                id = scanner.nextInt();
            }
            exists = true;
        }
        scanner.nextLine(); // Consume newline
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter bonus: ");
        double bonus = scanner.nextDouble();
        System.out.println("Enter penalty: ");
        double penalty = scanner.nextDouble();
        scanner.nextLine();

        var teacher = new Teacher(id, name, age, address, salary, bonus, penalty);
        teachers.add(teacher);
    }

    public void display() {
        if (teachers == null || teachers.isEmpty()) {
            System.out.println("No teachers to display.");
            return;
        }
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }

    public boolean deleteTeacher(int id) {
        if (teachers == null || teachers.isEmpty()) {
            return false;
        }
        if (checkId(id)) {
            teachers.removeIf(teacher -> teacher.getId() == id);
            return true;
        } else {
            return false;
        }
    }
}
