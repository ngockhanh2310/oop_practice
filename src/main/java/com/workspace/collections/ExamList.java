package com.workspace.collections;

import java.util.ArrayList;
import java.util.Random;

public class ExamList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            Random random = new Random();
            int num = random.nextInt(40) + 20;
            numbers.add(num);
        }

        System.out.println("Danh sách phần tử:");
        numbers.forEach(nums -> {
            if (numbers.indexOf(nums) == numbers.size() - 1) {
                System.out.print(nums + ".");
            } else {
                System.out.print(nums + ", ");
            }
        });
        /*
         * for (Integer num : numbers) {
         * if (numbers.indexOf(num) == numbers.size() - 1) {
         * System.out.print(num + ".");
         * } else {
         * System.out.print(num + ", ");
         * }
         * }
         */

        System.out.println("\nSố phần tử trong danh sách: " + numbers.size());
        // sum = numbers.stream().mapToInt(num -> num).sum();
        sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total: " + sum);
        double avg = (double) sum / numbers.size();
        System.out.println("Average: " + avg);
    }
}
