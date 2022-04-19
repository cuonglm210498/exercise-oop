package com.lecuong.bai_1;

import java.util.Scanner;

public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();

        do {
            System.out.print("Bac: ");
            bac = sc.nextInt();

            if (bac < 1 || bac > 10) {
                System.out.println("Bac phai tu 1 den 10!!!");
            }
        } while (bac < 1 || bac > 10);
    }

    public void hien() {
        System.out.println();
        super.hien();
        System.out.println("\t\tBac: " + bac);
    }
}
