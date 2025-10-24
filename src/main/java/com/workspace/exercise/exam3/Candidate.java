package com.workspace.exercise.exam3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Candidate {
    protected int candidateId;
    protected String name;
    protected String address;
    protected int priorityLevel;

    public void display() {
        System.out.println("Candidate ID: " + candidateId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Priority Level: " + priorityLevel);
    }
}
