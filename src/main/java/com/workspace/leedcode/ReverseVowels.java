package com.workspace.leedcode;

public class ReverseVowels {

    // hàm kiêm tra nguyên âm
    public boolean isVowel(char c) { 
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }


    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // chuyển chuỗi thành mảng ký tự
        // khởi tạo hai con trỏ i ở đầu và j ở cuối
        int i = 0, j = chars.length - 1; 
        while (i < j) {
            while (i < j && !isVowel(chars[i])) i++; // nếu ko phải nguyên âm thì tăng i
            while (i < j && !isVowel(chars[j])) j--; // nếu ko phải nguyên âm thì giảm j
            if (i < j) { // nếu i < j và cả hai là nguyên âm thì hoán đổi
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars); // chuyển mảng ký tự thành chuỗi và trả về
    }
    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
        System.out.println(reverseVowels.reverseVowels("hello")); // holle
        System.out.println(reverseVowels.reverseVowels("leetcode")); // leotcede
        System.out.println(reverseVowels.reverseVowels("aA")); // Aa
    }
}
