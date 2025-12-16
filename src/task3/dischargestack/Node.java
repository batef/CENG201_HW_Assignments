package task3.dischargestack;

public class Node {
    DischargeRecord data;
    Node next;

    public Node(DischargeRecord data) {
        this.data = data;
        this.next = null;
    }
}