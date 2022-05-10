package lesson8.task2.doctors;

import lesson8.task2.impl.Doctor;

public class Therapist implements Doctor {

    @Override
    public void cure() {
        System.out.println("Inspection completed");
    }
}
