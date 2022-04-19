package com.lecuong.bai_4;

import java.util.ArrayList;
import java.util.List;

import static com.lecuong.utils.ScannerUtils.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Nhap n ho dan: ");
        int n = sc.nextInt(); sc.nextLine();

        List<Person> personList = new ArrayList<>();
        List<Family> families = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Number of house: ");
            int numberOfHouse = sc.nextInt(); sc.nextLine();

            System.out.print("Nhap so nguoi cua ho dan: ");
            int people = sc.nextInt(); sc.nextLine();

            for (int j = 0; j < people; j++) {
                Person person = new Person();
                person.nhap();
                personList.add(person);
            }


            Family family = new Family();
            family.setNumberPeople(people);
            family.setNumberOfHouse(numberOfHouse);
            family.setPersons(personList);
            families.add(family);
        }

        Town town = new Town();
        town.setFamilies(families);

        System.out.println(town);
    }
}
