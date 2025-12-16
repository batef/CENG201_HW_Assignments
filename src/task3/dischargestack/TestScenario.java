package task3.dischargestack;

public class TestScenario {
    public static void main(String[] args) {
        DischargeStack stack = new DischargeStack();

        DischargeRecord r1 = new DischargeRecord(319);
        DischargeRecord r2 = new DischargeRecord(430);
        DischargeRecord r3 = new DischargeRecord(119);
        DischargeRecord r4 = new DischargeRecord(204);
        DischargeRecord r5 = new DischargeRecord(587);

        stack.push(r1);
        stack.push(r2);
        stack.push(r3);
        stack.push(r4);
        stack.push(r5);

        System.out.println("Popping 2 discharged patients:");
        //According to LIFO 204 and 587 should be popped.
        stack.pop();
        stack.pop();

        System.out.println("\nRemaining discharge stack:");
        stack.printStack();
    }
}
