package task3.dischargestack;

import java.text.SimpleDateFormat;
import java.util.Date;;

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
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            while(curr != null) {
                String formattedTime = sdf.format(new Date(curr.data.dischargeTime));
                System.out.println("Patient ID: " + curr.data.patientId + " | Discharge Time: " + formattedTime);
                curr = curr.next;
            }

        }
    }
    public int size() {
        return size;
    }

}
