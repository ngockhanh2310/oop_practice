package com.workspace.leedcode;

import java.util.Scanner;

// Hợp nhất các chuỗi luân phiên
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = ""; // tạo chuỗi kết quả rỗng
        int a = 0, b = 0; // tạo 2 biến đếm a, b

        // vòng lặp chạy khi a < độ dài chuỗi word1 hoặc b < độ dài chuỗi word2
        while(a < word1.length() || b < word2.length()){
            if(a < word1.length()){
                result += word1.charAt(a); // thêm ký tự tại vị trí a = 0 vào chuỗi kết quả
                a++; // tăng biến đếm a lên 1
            }
            if(b < word2.length()){
                result += word2.charAt(b); // thêm ký tự tại vị trí b = 0 vào chuỗi kết quả
                b++; // tăng biến đếm b lên 1
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Nhập chuoi 1: ");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        System.out.println("Nhập chuoi 2: ");
        String word2 = scanner.nextLine();
        System.out.println(solution.mergeAlternately(word1, word2));
        scanner.close();
    }
}
