package task3.dischargestack;

public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
}
