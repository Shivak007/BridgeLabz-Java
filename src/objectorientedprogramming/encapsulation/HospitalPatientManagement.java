package objectorientedprogramming.encapsulation;
abstract class Patient {
    protected int id;

    public Patient(int id) {
        this.id = id;
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    public InPatient(int id) {
        super(id);
    }

    public double calculateBill() {
        return 5000;
    }
}

class OutPatient extends Patient {
    public OutPatient(int id) {
        super(id);
    }

    public double calculateBill() {
        return 1500;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1);
        Patient p2 = new OutPatient(2);
        System.out.println("In-patient: " + p1.calculateBill());
        System.out.println("Out-patient: " + p2.calculateBill());
    }
}
