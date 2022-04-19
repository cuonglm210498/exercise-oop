package com.lecuong.bai_1;

import java.util.Scanner;

public class CanBo {

    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

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

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Tuoi: ");
        tuoi = sc.nextInt(); sc.nextLine();

        System.out.print("Gioi tinh: ");
        gioiTinh = sc.nextLine();
        switch (gioiTinh) {
            case "nam":
                gioiTinh = "Nam";
                break;
            case "Nam":
                gioiTinh = "Nam";
                break;
            case "Nu":
                gioiTinh = "Nu";
                break;
            case "nu":
                gioiTinh = "Nu";
                break;
            default:
                gioiTinh = "khac";
                break;
        }

        System.out.print("Dia chi: ");
        diaChi = sc.nextLine();
    }

    public void hien(){
        System.out.println("\t\tHo ten: " + hoTen);
        System.out.println("\t\tTuoi: " + tuoi);
        System.out.println("\t\tGioi tinh: " + gioiTinh);
        System.out.println("\t\tDia chi: " + diaChi);
    }
}
