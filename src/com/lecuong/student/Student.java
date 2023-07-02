package com.lecuong.student;

import lombok.*;

import java.util.Scanner;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

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
}
