package com.workspace.collections;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        Random random = new Random();
        String key = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-";
        StringBuilder sb = new StringBuilder();
        String randomString = "";
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(key.length());
            sb.append(key.charAt(index));
            randomString.concat(String.valueOf(key.charAt(index)));
        }
        System.out.println(sb.toString());
        System.out.println(randomString);
    }
}
