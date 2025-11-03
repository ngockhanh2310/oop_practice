package com.workspace.exercise;

public class Test {
    public static void main(String[] args) {
        System.out.print("For Loop: ");
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i < 5)
                System.out.print(" ");
        }
        System.out.println();

        // TODO: Print numbers 1 to 5 using while loop
        i = 1;
        System.out.print("While Loop: ");
        while (i <= 5) {
            System.out.print(i);
            if (i < 5)
                System.out.print(" ");
            i++;
        }
        System.out.println();

        // TODO: Print numbers 1 to 5 using do-while loop
        i = 1;
        System.out.print("Do-While Loop: ");
        do {
            System.out.print(i);
            System.out.print(" ");
            i++;
        } while (i <= 5);
        System.out.println();
    }
}
