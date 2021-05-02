package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

    Doctor underTest = new Doctor("1", "name", "specialty");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthOfPatientFrom10to20() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(patientHealthLevel, 20);
    }

    @Test
    public void decreaseBloodLevelFrom20to15WhenDrawingBlood(){
        underTest.drawPatientBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(patientBloodLevel, 15);
    }

    @Test
    public void shouldExpectSalaryOf90K(){
        int salary = underTest.calculatePay();
        assertEquals(salary, 90000);
    }
}
