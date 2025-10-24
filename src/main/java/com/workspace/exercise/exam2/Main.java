package com.workspace.exercise.exam2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1.Them tai lieu moi:");
            System.out.println("2.Hien thi tat ca tai lieu:");
            System.out.println("3.Tim kiem tai lieu theo ma:");
            System.out.println("4.Xoa tai lieu theo ma:");
            System.out.println("5.Thoat");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quanLySach.themTaiLieu();
                    break;
                case 2:
                    quanLySach.hienThiTatCaTaiLieu();
                    break;
                case 3:
                    String maTaiLieu = scanner.nextLine();
                    quanLySach.timKiemTaiLieuTheoMa(maTaiLieu);
                    break;
                case 4:
                    String maTaiLieuXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieuTheoMa(maTaiLieuXoa);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 5);
        scanner.close();
    }

}
