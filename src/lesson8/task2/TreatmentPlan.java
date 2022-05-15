package lesson8.task2;

import lesson8.task2.doctors.Dentist;
import lesson8.task2.doctors.Surgeon;
import lesson8.task2.doctors.Therapist;
import lesson8.task2.impl.Doctor;

public class TreatmentPlan {

    private byte doctorId;
    private String plan;
    private Doctor doctor;

    public TreatmentPlan(byte doctorId, String plan) {
        this.doctorId = doctorId;
        this.plan = plan;
        switch (this.doctorId) {
            case 1:
                this.doctor = new Surgeon();
                break;
            case 2:
                this.doctor = new Dentist();
                break;
            default:
                this.doctor = new Therapist();
                break;
        }
    }

    public byte getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(byte doctorId) {
        this.doctorId = doctorId;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
