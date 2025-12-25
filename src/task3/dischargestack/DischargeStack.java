package task3.dischargestack;

public class DischargeStack {
    Node top = null;
    int size = 0;

    public void push(DischargeRecord rec) {
        Node newNode = new Node(rec);
        newNode.next = this.top;
        this.top = newNode;
        ++this.size;
    }

    public DischargeRecord pop() {
        if (this.top == null) {
            return null;
        } else {
            DischargeRecord removed = this.top.data;
            this.top = this.top.next;
            --this.size;
            return removed;
        }
    }

    public DischargeRecord peek() {
        return this.top == null ? null : this.top.data;
    }

    public void printStack() {
        Node curr = this.top;
        if (curr == null) {
            System.out.println("Stack is empty");
        } else {
            while(curr != null) {
                System.out.println("Patient ID: " + curr.data.patientId + " | Discharge Time: " + curr.data.dischargeTime);
                curr = curr.next;
            }

        }
    }
    public int size() {
        return size;
    }

}
