package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse("1", "name", 5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLvlFrom10To15(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(15, healthLevel);
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
        assertEquals(salary, 80000);
    }

}
