package com.lecuong.student;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextInt(); sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt(); sc.nextLine();

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
    }

    public void output() {
        System.out.println("\t\t\tID: " + this.id);
        System.out.println("\t\t\tID: " + this.name);
        System.out.println("\t\t\tID: " + this.age);
        System.out.println("\t\t\tID: " + this.address);
        System.out.println("\t\t\tID: " + this.gpa);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
