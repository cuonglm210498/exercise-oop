package com.lecuong.bai_2;

import com.lecuong.bai_1.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Document> documents = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("Application Manager Documents");
            System.out.println("Enter 1: To insert documents");
            System.out.println("Enter 2: Delete documents by id");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: Search document");
            System.out.println();
            System.out.print("Enter the select: ");
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    System.out.println();
                    System.out.println("Enter 1: to insert Book");
                    System.out.println("Enter 2: to insert Journal");
                    System.out.println("Enter 3: to insert News");
                    System.out.print("Enter the select: ");
                    String select  = sc.nextLine();
                    switch (select) {
                        case "1":
                            Document book = new Book();
                            book.nhap();
                            documents.add(book);
                            break;
                        case "2":
                            Document journal = new Journal();
                            journal.nhap();
                            documents.add(journal);
                            break;
                        case "3":
                            Document news = new News();
                            news.nhap();
                            documents.add(news);
                            break;
                    }
                    break;
                case "2":
                    System.out.print("Enter the id: ");
                    int idDelete = sc.nextInt(); sc.nextLine();
                    documents.removeIf(p -> p.getId() == idDelete);
                    documents.forEach(p -> p.hien());
                    break;
                case "3":
                    documents.forEach(p -> p.hien());
                    break;
                case "4":
                    System.out.print("Enter the keyword: ");
                    String keyWord = sc.nextLine();

                    if (keyWord.equalsIgnoreCase("book"))
                        documents.stream().filter(p -> p instanceof Book).forEach(p -> p.hien());
                    else if (keyWord.equalsIgnoreCase("journal"))
                        documents.stream().filter(p -> p instanceof Journal).forEach(p -> p.hien());
                    else if (keyWord.equalsIgnoreCase("news"))
                        documents.stream().filter(p -> p instanceof News).forEach(p -> p.hien());
                    break;

                case "5":
                    System.exit(0);
                    break;
            }

        }
    }
}
