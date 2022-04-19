package com.lecuong.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Document {

    private String author;
    private int pageSize;

    public Book() {
    }

    public Book(String publishName, int numberCopies, String author, int pageSize) {
        super(publishName, numberCopies);
        this.author = author;
        this.pageSize = pageSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        super.nhap();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Page size: ");
        pageSize = sc.nextInt(); sc.nextLine();
    }

    public void hien() {
        super.hien();
        System.out.println("\t\tAuthor: " + author);
        System.out.println("\t\tPage size: " + pageSize);
    }
}
