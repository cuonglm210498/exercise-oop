package com.lecuong.bai_2;

import java.util.Scanner;

public class Journal extends Document {

    private int issueNumber;
    private int issueMonth;

    public Journal() {
    }

    public Journal(String publishName, int numberCopies, int issueNumber, int issueMonth) {
        super(publishName, numberCopies);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Issue number: ");
        issueNumber = sc.nextInt(); sc.nextLine();

        System.out.print("Issue month: ");
        issueMonth = sc.nextInt(); sc.nextLine();
    }

    public void hien() {
        super.hien();
        System.out.println("\t\tIssue number: " + issueNumber);
        System.out.println("\t\tIssue month: " + issueMonth);
    }
}
