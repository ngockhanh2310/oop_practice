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
public class BlockC extends Candidate{
    private double literatureScore;
    private double historyScore;
    private double geographyScore;

    @Override
    public void display() {
        System.out.println("Block C Candidate:");
        super.display();
        System.out.println("Literature Score: " + literatureScore);
        System.out.println("History Score: " + historyScore);
        System.out.println("Geography Score: " + geographyScore);
    }

}
