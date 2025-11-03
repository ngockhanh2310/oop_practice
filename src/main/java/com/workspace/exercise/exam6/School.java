package com.workspace.exercise.exam6;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("--- Adding a new student ---");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        System.out.print("Enter class: ");
        String className = scanner.nextLine();

        students.add(new Student(name, age, country, className));
        System.out.println("Student added successfully!");
    }
    
    public void display() {
        System.out.println("---- School Students Information ----");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }

    public boolean getStudentAge() {
        if (students.isEmpty()) {
            return false;
        } else {
            for (Student student : students) {
                if (student.getAge() == 20) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int countStudentsFromCountry() {
        int count = 0;
        for (Student student : students) {
            if ((student.getAge() == 23) && student.getCountry().equalsIgnoreCase("Vietnam")) {
                count++;
            }
        }
        return count;
    }
}
