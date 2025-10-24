package com.workspace.exercise.exam2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {

    private ArrayList<MaTaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        danhSachTaiLieu = new ArrayList<>();
    }

    public boolean checkMaTaiLieuExists(String maTaiLieu) {
        for (MaTaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getMaTaiLieu().equals(maTaiLieu)) {
                return true;
            }
        }
        return false;
    }

    public void themTaiLieu() {
        System.out.println("\n--- THEM TAI LIEU MOI ---");
        System.out.println("Chon loai tai lieu:");
        System.out.println("1. Sach");
        System.out.println("2. Tap chi");
        System.out.println("3. Bao");
        System.out.print("Lua chon: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Nhap ma tai lieu:");
        String maTaiLieu = scanner.nextLine();
        if (checkMaTaiLieuExists(maTaiLieu)) {
            System.out.println("Ma tai lieu da ton tai. Vui long nhap ma khac.");
            return;
        }
        System.out.println("Nhap ten nha xuat ban:");
        String tenNXB = scanner.nextLine();
        System.out.println("Nhap so ban phat hanh:");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        switch (choice) {
            case 1:
                System.out.println("Nhap ten tac gia:");
                String tenTacGia = scanner.nextLine();
                System.out.println("Nhap so trang:");
                int soTrang = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                danhSachTaiLieu.add(new Sach(maTaiLieu, tenNXB, soBanPhatHanh, tenTacGia, soTrang));
                System.out.println("Da them sach thanh cong!");
                break;
            case 2:
                System.out.println("Nhap so phat hanh:");
                int soPhatHanh = scanner.nextInt();
                System.out.println("Nhap thang phat hanh:");
                int thangPhatHanh = scanner.nextInt();
                scanner.nextLine(); // Consume newline 
                danhSachTaiLieu.add(new TapChi(maTaiLieu, tenNXB, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                System.out.println("Da them tap chi thanh cong!");
                break;
            case 3:
                System.out.println("Nhap ngay phat hanh:");
                String ngayPhatHanh = scanner.nextLine();
                danhSachTaiLieu.add(new Bao(maTaiLieu, tenNXB, soBanPhatHanh, LocalDate.parse(ngayPhatHanh)));
                System.out.println("Da them bao thanh cong!");
                break;

            default:
                System.out.println("Lua chon khong hop le");
                break;
        }
    }

    public void hienThiTatCaTaiLieu() {
        if (danhSachTaiLieu.isEmpty()) {
            System.out.println("Danh sach tai lieu rong");
            return;
        }
        for (MaTaiLieu taiLieu : danhSachTaiLieu) {
            taiLieu.show();
            System.out.println("-----------------------");
        }
    }

    public void timKiemTaiLieuTheoMa(String maTaiLieu) {
        for (MaTaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getMaTaiLieu().equals(maTaiLieu)) {
                taiLieu.show();
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu voi ma: " + maTaiLieu);
    }

    public void xoaTaiLieuTheoMa(String maTaiLieu) {
        for (int i = 0; i < danhSachTaiLieu.size(); i++) {
            if (danhSachTaiLieu.get(i).getMaTaiLieu().equals(maTaiLieu)) {
                danhSachTaiLieu.remove(i);
                System.out.println("Da xoa tai lieu voi ma: " + maTaiLieu);
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu voi ma: " + maTaiLieu);
    }
}
