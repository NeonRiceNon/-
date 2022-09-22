package com.company;

public class Student {
    String firstName;   //имя
    String lastName;    //фамилия
    String group;       //группа
    double averageMark; //средняя оценка
    int getScholarship;

    Aspirant ScWork = new Aspirant(); //ссылается на объект из аспиранта

    public Student(String firstName, String lastName, String group, double averageMark) {
    }

    public Student() {

    }

    void getScholarship(){     //метод для возврата суммы стипендии

        if (averageMark==5) {
            getScholarship = 10000;
        }else {
            getScholarship = 8000;
        }
    }
}
