package com.workspace.exercise.exam1;

import java.util.ArrayList;
import java.util.Scanner;

// Lớp cha CanBo
class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
    }
}

// Lớp CongNhan kế thừa từ CanBo
class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== CONG NHAN ===");
        super.hienThiThongTin();
        System.out.println("Bac: " + bac);
    }
}

// Lớp KySu kế thừa từ CanBo
class KySu extends CanBo {
    private String nghanhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nghanhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nghanhDaoTao = nghanhDaoTao;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== KY SU ===");
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nghanhDaoTao);
    }
}

// Lớp NhanVien kế thừa từ CanBo
class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== NHAN VIEN ===");
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec);
    }
}

// Lớp QLCB - Quản lý cán bộ
class QLCB {
    private ArrayList<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    // Thêm mới cán bộ
    public void themCanBo(Scanner sc) {
        System.out.println("\n--- THEM CAN BO MOI ---");
        System.out.println("Chon loai can bo:");
        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");
        System.out.print("Lua chon: ");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh (nam/nu/khac): ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        switch (loai) {
            case 1:
                System.out.print("Nhap bac (1-10): ");
                int bac = sc.nextInt();
                sc.nextLine();
                danhSachCanBo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                System.out.println("Da them cong nhan thanh cong!");
                break;
            case 2:
                System.out.print("Nhap nganh dao tao: ");
                String nganh = sc.nextLine();
                danhSachCanBo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganh));
                System.out.println("Da them ky su thanh cong!");
                break;
            case 3:
                System.out.print("Nhap cong viec: ");
                String congViec = sc.nextLine();
                danhSachCanBo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                System.out.println("Da them nhan vien thanh cong!");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoTen(Scanner sc) {
        System.out.print("\nNhap ho ten can tim: ");
        String tenCanTim = sc.nextLine().toLowerCase();
        boolean timThay = false;

        System.out.println("\n--- KET QUA TIM KIEM ---");
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().toLowerCase().contains(tenCanTim)) {
                cb.hienThiThongTin();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay can bo nao!");
        }
    }

    // Hiển thị danh sách cán bộ
    public void hienThiDanhSach() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("\nDanh sach can bo trong!");
            return;
        }

        System.out.println("\n--- DANH SACH CAN BO ---");
        for (CanBo cb : danhSachCanBo) {
            cb.hienThiThongTin();
        }
    }
}

// Chương trình chính
public class QuanLyCanBo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        int luaChon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them can bo");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    qlcb.themCanBo(sc);
                    break;
                case 2:
                    qlcb.timKiemTheoTen(sc);
                    break;
                case 3:
                    qlcb.hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 4);

        sc.close();
    }
}
