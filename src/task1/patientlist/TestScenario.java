package task1.patientlist;

public class TestScenario {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        Patient p1 = new Patient(101, "Batuhan Efe Korkmaz", 5, 20);
        Patient p2 = new Patient(113, "Ayse Demir", 3, 22);
        Patient p3 = new Patient(117, "Mehmet Kaya", 8, 45);
        Patient p4 = new Patient(148, "Zeynep Acar", 6, 29);
        Patient p5 = new Patient(184, "Can Oz", 2, 19);

        patientList.addPatient(p1);
        patientList.addPatient(p2);
        patientList.addPatient(p3);
        patientList.addPatient(p4);
        patientList.addPatient(p5);

        System.out.println("Removing patient with ID 117");
        patientList.removePatient(117);

        System.out.println("Searching patient with ID 113");
        Patient found = patientList.findPatient(113);
        // findPatient may return a Patient object or null.
        // We assign the result to 'found' so we can check
        // if the patient exists before using its data.

        if (found != null) {
            System.out.println("Found -> ID: " + found.id + " | Name: " + found.name + " | Severity: " + found.severity + " | Age: " + found.age);
        } else {
            System.out.println("Patient not found");
        }

        System.out.println("\nFinal Patient List:");
        patientList.printList();

    }
}
