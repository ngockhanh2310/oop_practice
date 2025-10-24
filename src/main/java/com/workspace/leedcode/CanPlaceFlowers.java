package com.workspace.leedcode;

public class CanPlaceFlowers {


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // biến đếm số hoa có thể trồng

        for (int i = 0; i < flowerbed.length; i++) {
            // kiểm tra nếu vị trí hiện tại là 0 (chưa có hoa)
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i -1] == 0) && 
            ( i == flowerbed.length -1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // trồng hoa tại vị trí hiện tại
                count++; // tăng biến đếm
            }           
        }
        return count >= n; // kiểm tra nếu số hoa có thể trồng >= n
    }

    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 1)); // true
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 2)); // false
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0}, 1)); // true
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,1,0,0}, 2)); // false
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{0}, 1)); // true
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1}, 1)); // false
    }
}
