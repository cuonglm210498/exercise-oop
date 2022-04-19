package com.lecuong.bai_2;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Document {

    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;
    private String publishName;
    private int numberCopies;

    public Document() {
    }

    public Document(String publishName, int numberCopies) {
        this.publishName = publishName;
        this.numberCopies = numberCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public void nhap() {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        id = count.incrementAndGet();

        System.out.print("Publish name: ");
        publishName = sc.nextLine();
        System.out.print("Number of copies: ");
        numberCopies = sc.nextInt(); sc.nextLine();
    }

    public void hien() {
        System.out.println();
        System.out.println("\t\tID: " + id);
        System.out.println("\t\tPublish name: " + publishName);
        System.out.println("\t\tNumber of copies: " + numberCopies);
    }

}
