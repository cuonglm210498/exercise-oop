package com.lecuong.bai_4;

import com.lecuong.utils.ScannerUtils;

import java.util.List;

public class Family {

    private int numberPeople;
    private int numberOfHouse;
    private List<Person> persons;

    public Family() {
    }

    public Family(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public int getNumberPeople() {
        return persons.size();
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberPeople=" + numberPeople +
                ", numberOfHouse=" + numberOfHouse +
                ", persons=" + persons +
                '}';
    }
}
