package com.lecuong.bai_3;

import java.util.Scanner;

public class CandidateB extends Candidate {

    private static final String TOAN = "Toan";
    private static final String SINH = "SINH";
    private static final String HOA = "Hoa";

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
    }

    public void hien() {
        super.hien();
        System.out.println("\t\tKhoi thi B: " + TOAN + " " + SINH + " " + HOA);
    }
}
