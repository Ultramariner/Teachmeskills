package lesson8.task2;

public class Patient extends TreatmentPlan{

    private String name;

    public Patient(String name, byte doctorId, String plan) {
        super(doctorId, plan);
        this.name = name;
    }

    public void getInfo() {
        System.out.printf("Patient %s has next treatment plan: %s%nDoctors comment: ", this.name, this.getPlan());
        getDoctor().cure();
    }
}
