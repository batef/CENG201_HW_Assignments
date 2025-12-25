package task4.hospitalsystem;

import task1.patientlist.*;
import task2.treatmentqueue.*;
import task3.dischargestack.*;
import java.util.HashMap;

public class HospitalSystem {

    private final PatientList admittedPatients;
    private final TreatmentQueue normalQueue;
    private final TreatmentQueue priorityQueue;
    private final DischargeStack dischargeStack;
    private final HashMap<Integer, Patient> patientLookup;

    public HospitalSystem() {
        admittedPatients = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientLookup = new HashMap<>();
    }

    public void registerPatient(Patient p) {
        admittedPatients.addPatient(p);
        patientLookup.put(p.id, p);
    }

    public void addTreatmentRequest(int patientId, boolean isPriority) {
        TreatmentRequest req = new TreatmentRequest(patientId, isPriority);
        if (isPriority) {
            priorityQueue.enqueue(req);
        } else {
            normalQueue.enqueue(req);
        }
    }

    public void processNextTreatment() {
        TreatmentRequest nextReq = null;

        if (priorityQueue.size() > 0) {
            nextReq = priorityQueue.dequeue();
        } else if (normalQueue.size() > 0) {
            nextReq = normalQueue.dequeue();
        }

        if (nextReq != null) {
            System.out.println("Processing Patient ID: " + nextReq.patientId);

            dischargeStack.push(new DischargeRecord(nextReq.patientId));
            admittedPatients.removePatient(nextReq.patientId);
            patientLookup.remove(nextReq.patientId);
        } else {
            System.out.println("No pending treatment requests.");
        }
    }

    public void sortPatientsBySeverity() {
        Patient[] patients = patientLookup.values().toArray(new Patient[0]);

        for (int i = 0; i < patients.length - 1; i++) {
            for (int j = 0; j < patients.length - i - 1; j++) {
                if (patients[j].getSeverity() < patients[j + 1].getSeverity()) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- Patients Sorted by Severity ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.id +
                    " | Name: " + p.name +
                    " | Severity: " + p.getSeverity());
        }
    }

    public void printStatus() {
        System.out.println("\n--- Current Hospital State ---");
        System.out.println("Waiting in Priority Queue: " + priorityQueue.size());
        System.out.println("Waiting in Normal Queue: " + normalQueue.size());
        System.out.println("Total Discharged: " + dischargeStack.size());
        System.out.println("------------------------------");
    }
}
