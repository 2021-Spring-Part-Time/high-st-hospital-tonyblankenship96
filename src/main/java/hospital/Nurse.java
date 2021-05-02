package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{

    private int numPatients;

    public Nurse(String employeeNumber, String name, int numPatients) {
        super(employeeNumber, name);
        this.numPatients = numPatients;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawPatientBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    @Override
    public int calculatePay() {
        return 80000;
    }
}
