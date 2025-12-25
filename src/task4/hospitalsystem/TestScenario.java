package task4.hospitalsystem;

import task1.patientlist.Patient;
import task4.hospitalsystem.HospitalSystem;

public class TestScenario {

    public static void main(String[] args) {

        // 1️⃣ Hospital System oluştur
        HospitalSystem system = new HospitalSystem();

        // 2️⃣ 10 hasta ekle
        system.registerPatient(new Patient(101, "Ahmet Yilmaz", 8, 45));
        system.registerPatient(new Patient(222, "Ayse Demir", 3, 30));
        system.registerPatient(new Patient(473, "Mehmet Kaya", 6, 60));
        system.registerPatient(new Patient(564, "Zeynep Aydin", 9, 25));
        system.registerPatient(new Patient(675, "Ali Can", 4, 40));
        system.registerPatient(new Patient(896, "Elif Yasar", 7, 35));
        system.registerPatient(new Patient(437, "Burak Polat", 5, 28));
        system.registerPatient(new Patient(218, "Merve Sahin", 2, 50));
        system.registerPatient(new Patient(129, "Ozan Koc", 10, 65));
        system.registerPatient(new Patient(910, "Deniz Ak", 1, 22));

        // 3️⃣ 5 normal + 3 priority tedavi isteği
        system.addTreatmentRequest(101, false);
        system.addTreatmentRequest(222, false);
        system.addTreatmentRequest(473, false);
        system.addTreatmentRequest(564, false);
        system.addTreatmentRequest(675, false);

        system.addTreatmentRequest(896, true);
        system.addTreatmentRequest(437, true);
        system.addTreatmentRequest(218, true);

        // 4️⃣ 2 manuel taburcu (stack test)
        system.processNextTreatment();
        system.processNextTreatment();

        // 5️⃣ 4 tedavi işlemi (öncelikli önce)
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();

        // 6️⃣ Hastaları severity’ye göre sırala
        system.sortPatientsBySeverity();

        // 7️⃣ Sistemin son durumunu yazdır
        system.printStatus();
    }
}

