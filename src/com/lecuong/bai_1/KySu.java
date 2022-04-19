package com.lecuong.bai_1;

import java.util.Scanner;

public class KySu extends CanBo {

    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        super.nhap();

        System.out.print("Nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    public void hien() {
        System.out.println();
        super.hien();
        System.out.println("\t\tNganh dao tao: " + nganhDaoTao);
    }
}
