package lesson8.task2.doctors;

import lesson8.task2.impl.Doctor;

public class Surgeon implements Doctor {

    @Override
    public void cure() {
        System.out.println("Surgery completed");
    }
}
