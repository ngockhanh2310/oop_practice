package com.workspace.leedcode;

import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0; // tạo biến lưu số kẹo nhiều nhất trong mảng

        // duyệt mảng để tìm số kẹo nhiều nhất
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy); // gán giá trị lớn nhất vào biến maxCandies
        }

        for (int i = 0; i < candies.length; i++) {
            // kiểm tra nếu số kẹo hiện tại + số kẹo thêm >= số kẹo nhiều nhất
            if(candies[i] + extraCandies >= maxCandies) {
                result.add(true); // thêm true vào danh sách kết quả
            } else {
                result.add(false); // thêm false vào danh sách kết quả
            }
        }
        return result;
    }
    public static void main(String[] args) {
        KidsCandies kidsCandies = new KidsCandies();
        System.out.println(kidsCandies.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(kidsCandies.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsCandies.kidsWithCandies(new int[]{12,1,12}, 10));
    }
}
