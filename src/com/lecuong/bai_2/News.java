package com.lecuong.bai_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class News extends Document {

    private LocalDate dateRelease;

    public News() {
    }

    public News(String publishName, int numberCopies, LocalDate dateRelease) {
        super(publishName, numberCopies);
        this.dateRelease = dateRelease;
    }

    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(LocalDate dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();

        System.out.print("Release date: ");
        String date = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dateRelease = LocalDate.parse(date, dateTimeFormatter);
    }

    public void hien() {
        super.hien();
        System.out.println("\t\tRelease date: " + dateRelease);
    }
}
