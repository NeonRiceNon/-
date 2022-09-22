package com.company;

public class Aspirant extends Student {
    String ScientificWork;
    double getScholarship = 5.0;

    public Aspirant(String firstName, String lastName, String group, double v, String ScientificWork) {
        super();
    }

    public Aspirant() {

    }

    @Override
    void getScholarship(){     //метод для возврата суммы стипендии

        if (averageMark==5) {
            getScholarship = 20000;

        }else {
            getScholarship = 18000;
        }
    }
}
