package hospital;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1", "Doc Name", "specialty");
    Nurse nurse = new Nurse("2", "nurse name", 5);
    Janitor janitor = new Janitor("3", "janitor name", "department", true);

    @Test
    public void shouldBeAbleToHireDoctor(){
        underTest.hire(doctor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        assertEquals("Doc Name", foundDoctor.getName());
    }

    @Test
    public void shouldBeABleToHireADocNurseAndJanitor(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        HospitalEmployee foundNurse = underTest.findEmployee("2");
        HospitalEmployee foundJanitor = underTest.findEmployee("3");
        assertEquals("Doc Name", foundDoctor.getName());
        assertEquals("nurse name", foundNurse.getName());
        assertEquals("janitor name", foundJanitor.getName());
    }

    @Test
    public void shouldBeAbleToHireACollectionOfEmployees(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> hiredEmployees = underTest.getAllEmployees();
    }

    @Test
    public void shouldDisplayAllMedicalPersonnel(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> medicalEmployees = underTest.getMedicalEmployees();
    }

    @Test
    public void shouldAdmitTwoPatients(){
        Patient sickPatient = new Patient();
        Patient sickerPatient = new Patient(5,10);
        underTest.admit(sickPatient);
        underTest.admit(sickerPatient);
        Collection<Patient> admittedPatients = underTest.getAllPatients();
    }


}
