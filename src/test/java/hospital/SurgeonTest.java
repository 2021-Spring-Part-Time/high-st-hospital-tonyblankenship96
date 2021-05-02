package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthFrom10to20(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20,healthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20to15WhenDrawingBlood(){
        underTest.drawPatientBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(patientBloodLevel, 15);
    }

    @Test
    public void shouldExpectSalaryOf100K(){
        int salary = underTest.calculatePay();
        assertEquals(salary, 100000);
    }
}
