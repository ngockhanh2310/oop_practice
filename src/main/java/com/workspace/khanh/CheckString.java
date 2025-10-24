package com.workspace.khanh;

import java.util.Scanner;

public class CheckString {
    public static boolean isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') { // kiểm tra ký tự có nằm ngoài khoảng '0' đến '9'
                return false;
            }
        }
        return true;
    }
    public static boolean isLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) { // kiểm tra ký tự có nằm ngoài khoảng 'a' đến 'z' hoặc 'A' đến 'Z'
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập chuỗi thứ nhất: ");
            String input = scanner.nextLine();
            if (isDigit(input)) {
                System.out.println("Chuỗi ko chứa kĩ tự chữ (chỉ chứa các chữ số).");
            } else {
                System.out.println("Chuỗi không chỉ chứa các chữ số.");
            }
            System.out.print("Nhập chuỗi thứ hai: ");
            String input2 = scanner.nextLine();
            if (isLetter(input2)) {
                System.out.println("Chuỗi ko chứa kĩ tự số (chỉ chứa các chữ cái).");
            } else {
                System.out.println("Chuỗi không chỉ chứa các chữ cái.");
            }
        }
    }
}
