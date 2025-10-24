package com.workspace.exercise.exam3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BlockA extends Candidate {
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    @Override
    public void display() {
        System.out.println("Block A Candidate:");
        super.display();
        System.out.println("Math Score: " + mathScore);
        System.out.println("Physics Score: " + physicsScore);
        System.out.println("Chemistry Score: " + chemistryScore);
    }
}
