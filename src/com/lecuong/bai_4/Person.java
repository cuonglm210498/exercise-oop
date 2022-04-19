package com.lecuong.bai_4;

import static com.lecuong.utils.ScannerUtils.*;

public class Person {

    private String fullName;
    private int age;
    private String job;
    private String passport;

    public Person() {
    }

    public Person(String fullName, int age, String job, String passport) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.passport = passport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void nhap() {

        System.out.print("Full name: ");
        fullName = sc.nextLine();

        System.out.print("Age: ");
        age = sc.nextInt(); sc.nextLine();

        System.out.print("Job: ");
        job = sc.nextLine();

        System.out.print("Passport: ");
        passport = sc.nextLine();
    }

//    public void hien() {
//        System.out.println("\t\tFullname: " + fullName);
//        System.out.println("\t\tAge: " + age);
//        System.out.println("\t\tJob: " + job);
//        System.out.println("\t\tPassport: " + passport);
//    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
