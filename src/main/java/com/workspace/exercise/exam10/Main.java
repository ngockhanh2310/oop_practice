package com.workspace.exercise.exam10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content of the document:");
        String text = scanner.nextLine();
        document.setText(text);
        String documentText = document.getText();
        System.out.println("1.The content of the document is: " + documentText);
        System.out.println("2. Lenth of the document is: " + documentText.length());
        System.out.println("3.The number of words in the document is: " + countWords(documentText));
        System.out.println("4.The number of characters 'A' or 'a' in the document is: " + countCharacters(documentText));
        System.out.println("5.The standardized text is: " + standardizeText(documentText));
        scanner.close();
    }

    private static int countWords(String document) {
        String length[] = document.trim().split("\\s+");
        int count = 0;
        for (int i = 0; i < length.length; i++) {
            count++;
        }
        return count;
    }

    private static int countCharacters(String document) {
        String length = document.trim();
        int count = 0;
        for (int i = 0; i < length.length(); i++) {
            if (length.charAt(i) == 'A' || length.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
    private static String standardizeText(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }
}
