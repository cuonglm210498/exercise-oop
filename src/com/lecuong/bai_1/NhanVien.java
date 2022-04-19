package com.lecuong.bai_1;

import java.util.Scanner;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        super.nhap();

        System.out.print("Cong viec: ");
        congViec = sc.nextLine();
    }

    public void hien() {
        System.out.println();
        super.hien();
        System.out.println("\t\tCong viec: " + congViec);
    }
}
