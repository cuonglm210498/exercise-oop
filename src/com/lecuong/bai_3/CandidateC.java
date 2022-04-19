package com.lecuong.bai_3;

import java.util.Scanner;

public class CandidateC extends Candidate {

    private static final String VAN = "Van";
    private static final String SU = "Su";
    private static final String DIA = "Dia";

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
    }

    public void hien() {
        super.hien();
        System.out.println("\t\tKhoi thi B: " + VAN + " " + SU + " " + DIA);
    }
}
