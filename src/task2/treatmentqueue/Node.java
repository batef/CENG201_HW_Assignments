package task2.treatmentqueue;

public class Node {
    TreatmentRequest data;
    Node next;

    public Node(TreatmentRequest data) {
        this.data = data;
        this.next = null;
    }
}
