package com.lecuong.bai_3;

import com.lecuong.bai_2.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Candidate> candidates = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("Application Manager Candidates");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: Show infomation cadidate");
            System.out.println("Enter 3: Find by exam id");
            System.out.println("Enter 4: Exit");
            System.out.println();
            System.out.print("Enter the select: ");
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println();
                    System.out.println("Enter 1: to insert candidate A");
                    System.out.println("Enter 2: to insert candidate B");
                    System.out.println("Enter 3: to insert candidate B");
                    System.out.print("Enter the select: ");
                    String select = sc.nextLine();
                    switch (select) {
                        case "1":
                            Candidate candidateA = new CandidateA();
                            candidateA.nhap();
                            candidates.add(candidateA);
                            break;
                        case "2":
                            Candidate candidateB = new CandidateB();
                            candidateB.nhap();
                            candidates.add(candidateB);
                            break;
                        case "3":
                            Candidate candidateC = new CandidateC();
                            candidateC.nhap();
                            candidates.add(candidateC);
                            break;
                    }
                    break;
                case "2":
                    candidates.forEach(p -> p.hien());
                    break;
                case "3":
                    System.out.print("Enter the exam id: ");
                    String examIdSearch = sc.nextLine();
                    candidates.stream().filter(p -> p.getExamId().equalsIgnoreCase(examIdSearch)).forEach(p -> p.hien());
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
