package com.workspace.leedcode;

public class GreatestStrings {
    // Hàm tính GCD của hai số
    private static int gcd(int a, int b) { 
        while (b != 0) { //
            int temp = b;
            b = a % b;
            a = temp; 
            // ví dụ: a = 6, b = 4 -> temp = 4, b = 6%4=2 ,
            //  a = 4 -> temp = 2, b= 4%2= 0, a = 2
        }
        return a;
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Kiểm tra điều kiện: str1 + str2 == str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) { // nếu không bằng nhau
            return "";
        }
        // Lấy chuỗi con dài nhất
        // Tính GCD của độ dài hai chuỗi
        int gcdLength = gcd(str1.length(), str2.length()); 
        // ví dụ: str1 = "ABCABC", str2 = "ABC" -> độ dài str1 = 6, 
        //độ dài str2 = 3 -> GCD(6, 3) = 3
        // substring(0, gcdLength) trả về chuỗi con từ vị trí 0 đến gcdLength
        return str1.substring(0, gcdLength);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC")); 
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); 
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
