package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Student st = new Student("Karl", "Karlov", "gr308", 4.96);
    Aspirant as = new Aspirant("leon", "Wint", "gr401", 5.0, "Nature1");

    Student[] students= {st, as};
}