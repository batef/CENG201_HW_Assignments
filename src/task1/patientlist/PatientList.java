package task1.patientlist;

public class PatientList {
    private Node head = null;

    public void addPatient(Patient p) {
        Node newNode = new Node(p);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current;
            for(current = this.head; current.next != null; current = current.next) {
            }

            current.next = newNode;
        }

    }

    public void removePatient(int id) {
        if (this.head != null) {
            if (this.head.data.id == id) {
                this.head = this.head.next;
            } else {
                for(Node current = this.head; current.next != null; current = current.next) {
                    if (current.next.data.id == id) {
                        current.next = current.next.next;
                        return;
                    }
                }

            }
        }
    }

    public Patient findPatient(int id) {
        for(Node current = this.head; current.next != null; current = current.next) {
            if (current.data.id == id) {
                return current.data;
            }
        }

        return null;
    }

    public void printList() {
        Node current = this.head;
        if (current == null) {
            System.out.println("Patient list is empty.");
        } else {
            while(current.next != null) {
                System.out.println("ID: " + current.data.id + " | Name: " +
                        current.data.name + " | Severity: " + current.data.severity +
                        " | Age: " + current.data.age);
                current = current.next;
            }

        }
    }
}
