package homeworcs.medicalCenter.doctorsAndPatients;

import java.util.Scanner;

public class Patient extends Person {

    public Patient(String id, String name, String surname, int phone, Doctor doctor, String registerDateTime) {
        super(id, name, surname, phone, doctor, registerDateTime);
    }

    public Patient() {
    }
}
