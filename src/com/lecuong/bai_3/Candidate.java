package com.lecuong.bai_3;

import java.util.Scanner;

public class Candidate {

    private String examId;
    private String fullName;
    private String address;
    private int priority;

    public Candidate() {
    }

    public Candidate(String examId, String fullName, String address, int priority) {
        this.examId = examId;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Exam id: ");
        examId = sc.nextLine();

        System.out.print("Fullname: ");
        fullName = sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();

        System.out.print("Priority: ");
        priority = sc.nextInt(); sc.nextLine();
    }

    public void hien() {
        System.out.println();
        System.out.println("\t\tExam id: " + examId);
        System.out.println("\t\tFull name: " + fullName);
        System.out.println("\t\tAddress: " + address);
        System.out.println("\t\tPriority: " + priority);

    }
}
