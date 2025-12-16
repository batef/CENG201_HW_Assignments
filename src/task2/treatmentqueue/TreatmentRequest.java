package task2.treatmentqueue;

public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }
}
