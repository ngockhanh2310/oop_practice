package com.workspace.exercise.exam4;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Person {
    private String name;
    private int age;
    private String job;
    private String idCard; // CMND

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("ID Card: " + idCard);
    }

    public void addInfoPerson(Scanner scanner) {
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter job: ");
        this.job = scanner.nextLine();

        System.out.print("Enter ID Card: ");
        this.idCard = scanner.nextLine();
    }
}
