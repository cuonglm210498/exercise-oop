package com.lecuong.bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<CanBo> canBos = new ArrayList<>();

        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            System.out.println("Enter the select: ");
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    System.out.print("Enter the select: ");
                    String select = sc.nextLine();
                    switch (select) {
                        case "1":
                            KySu kySu = new KySu();
                            kySu.nhap();
                            canBos.add(kySu);
                            break;
                        case "2":
                            CongNhan congNhan = new CongNhan();
                            congNhan.nhap();
                            canBos.add(congNhan);
                            break;
                        case "3":
                            NhanVien nhanVien = new NhanVien();
                            nhanVien.nhap();
                            canBos.add(nhanVien);
                            break;
                    }
                    break;
                case "2":
                    System.out.print("Enter the name search: ");
                    String nameSearch = sc.nextLine();
                    canBos.stream().filter(p -> p.getHoTen().equalsIgnoreCase(nameSearch)).forEach(p -> p.hien());
                    break;
                case "3":
                    canBos.forEach(p -> p.hien());
                    break;
                case "4":
                    canBos.stream().filter(p -> p instanceof NhanVien).forEach(p -> p.hien());
                    break;
            }
        }

    }
}
