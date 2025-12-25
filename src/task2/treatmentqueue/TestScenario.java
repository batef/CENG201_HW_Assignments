package task2.treatmentqueue;

public class TestScenario {
    public static void main(String[] args) {
        TreatmentQueue tq = new TreatmentQueue();

        TreatmentRequest tr1 = new TreatmentRequest(113, false);
        TreatmentRequest tr2 = new TreatmentRequest(114, false);
        TreatmentRequest tr3 = new TreatmentRequest(115, false);
        TreatmentRequest tr4 = new TreatmentRequest(116, false);
        TreatmentRequest tr5 = new TreatmentRequest(117, false);
        TreatmentRequest tr6 = new TreatmentRequest(118, true);  // priority
        TreatmentRequest tr7 = new TreatmentRequest(119, true);  // priority
        TreatmentRequest tr8 = new TreatmentRequest(120, false);

        tq.enqueue(tr1);
        tq.enqueue(tr2);
        tq.enqueue(tr3);
        tq.enqueue(tr4);
        tq.enqueue(tr5);
        tq.enqueue(tr6);
        tq.enqueue(tr7);
        tq.enqueue(tr8);

        System.out.println("Processing 3 treatment requests:");
        tq.dequeue();
        tq.dequeue();
        tq.dequeue();

        System.out.println("\nRemaining treatment queue:");
        tq.printQueue();
    }
}
