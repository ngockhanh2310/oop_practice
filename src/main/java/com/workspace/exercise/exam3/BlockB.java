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
public class BlockB extends Candidate{
    private double biologyScore;
    private double chemistryScore;
    private double mathScore;

    @Override
    public void display() {
        System.out.println("Block B Candidate:");
        super.display();
        System.out.println("Biology Score: " + biologyScore);
        System.out.println("Chemistry Score: " + chemistryScore);
        System.out.println("Mathematics Score: " + mathScore);
    }
}
