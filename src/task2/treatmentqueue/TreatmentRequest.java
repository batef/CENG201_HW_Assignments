package task2.treatmentqueue;

public class TreatmentRequest {
    public int patientId;
    public long arrivalTime;
    public boolean priority;

    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }
}
