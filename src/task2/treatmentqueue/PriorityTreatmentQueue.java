package task2.treatmentqueue;

public class PriorityTreatmentQueue {
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;

    public PriorityTreatmentQueue() {
        priorityQueue = new TreatmentQueue();
        normalQueue = new TreatmentQueue();
    }

    public void enqueue(TreatmentRequest request) {
        if (request.priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public TreatmentRequest dequeue() {
        if (!priorityQueue.isEmpty()) {
            return priorityQueue.dequeue();
        }
        return normalQueue.dequeue();
    }

    public void printQueue() {
        System.out.println("Priority Queue:");
        priorityQueue.printQueue();

        System.out.println("Normal Queue:");
        normalQueue.printQueue();
    }
}
