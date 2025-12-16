package task2.treatmentqueue;

public class TreatmentQueue {
    Node front = null;
    Node rear = null;
    int size = 0;

    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }

        ++this.size;
    }

    public TreatmentRequest dequeue() {
        if (this.front == null) {
            return null;
        } else {
            TreatmentRequest removed = this.front.data;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }

            --this.size;
            return removed;
        }
    }

    public int size() {
        return this.size;
    }

    public void printQueue() {
        Node curr = this.front;
        if (curr == null) {
            System.out.println("Empty treatment queue");
        } else {
            while(curr != null) {
                System.out.println("Patient ID: " + curr.data.patientId +
                        " | Arrival Time: " + curr.data.arrivalTime);
                curr = curr.next;
            }

        }
    }
}
