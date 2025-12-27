package task4.hospitalsystem;

import task1.patientlist.Patient;
import task4.hospitalsystem.HospitalSystem;

public class TestScenario {

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        // adding 10 patients
        system.registerPatient(new Patient(101, "Ahmet Yilmaz", 8, 45));
        system.registerPatient(new Patient(222, "Ayse Demir", 3, 30));
        system.registerPatient(new Patient(473, "Mehmet Kaya", 6, 60));
        system.registerPatient(new Patient(564, "Zeynep Aydin", 9, 25));
        system.registerPatient(new Patient(675, "Ali Can", 4, 40));
        system.registerPatient(new Patient(896, "Elif Yasar", 7, 35));
        system.registerPatient(new Patient(437, "Burak Polat", 5, 28));
        system.registerPatient(new Patient(218, "Merve Sahin", 2, 50));
        system.registerPatient(new Patient(129, "Ozan Koc", 10, 65));
        system.registerPatient(new Patient(910, "Deniz Ak", 1, 22));

        // 5 normal patient and 3 priority patient
        system.addTreatmentRequest(101, false);
        system.addTreatmentRequest(222, false);
        system.addTreatmentRequest(473, false);
        system.addTreatmentRequest(564, false);
        system.addTreatmentRequest(675, false);

        system.addTreatmentRequest(896, true);
        system.addTreatmentRequest(437, true);
        system.addTreatmentRequest(218, true);


        system.processNextTreatment();
        system.processNextTreatment();

        // 4 priority treatments
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();

        // sorting by severity
        system.sortPatientsBySeverity();

        // show the end of the status
        system.printStatus();
    }
}

