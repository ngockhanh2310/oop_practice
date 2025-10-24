package com.workspace.exercise.exam2;

import java.time.LocalDate;

public class Bao extends MaTaiLieu {
    private LocalDate ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, LocalDate ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void show() {
        System.out.println("Thong tin bao:");
        super.show();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh);
    }
}
