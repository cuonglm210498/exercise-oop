package com.lecuong.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        flag:while (true) {
            System.out.println("*******************************");
            System.out.println("\t\t1. Add student");
            System.out.println("\t\t2. Delete student");
            System.out.println("\t\t3. Sort student by GPA");
            System.out.println("\t\t4. Sort student by name");
            System.out.println("\t\t5. Show student");
            System.out.println("\t\t6. Exit");
            System.out.println("*******************************");

            System.out.print("Enter your select: ");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    System.out.print("Enter student id: ");
                    int studentIdDelete = sc.nextInt();
                    deleteStudent(studentIdDelete, students);
                    break;
                case 3:
                    sortStudentByGpa(students);
                    break;
                case 4:
                    sortStudentByName(students);
                    break;
                case 5:
                    System.out.println(students);
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Your choice is not correct");

            }
        }
    }

    public static void addStudent() {
        Student student = new Student();
        student.input();
        students.add(student);
    }

    public static void deleteStudent(int id, List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                students.remove(i);
            } else {
                System.out.println("\t\t\tStudent not found");
            }
        }
    }

    public static void sortStudentByGpa(List<Student> students) {
        Collections.sort(students, (o1, o2) -> {
            return o1.getGpa() > o2.getGpa() ? 1 : -1;
        });
    }

    public static void sortStudentByName(List<Student> students) {
        Collections.sort(students, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
    }
}
