package homeworcs.medicalCenter.storages;

import homeworcs.medicalCenter.doctorsAndPatients.Doctor;
import homeworcs.medicalCenter.doctorsAndPatients.Patient;


public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = 0;


    public void addPatients(Patient patient) {
        if (size == patients.length) {
            extend();
        } else {
            patients[size++] = patient;
        }
    }

    private void extend() {
        Patient[] patients2 = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, patients2, 0, patients.length);
        patients = patients2;
    }


    public void print() {
        if (size == 0) {
            System.err.println("հիվանդ չկա");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(patients[i]);
            }
        }
    }


    public void prinpAllPatientBYId(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorFromStorage)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void deletPatient(Doctor doctorFromStorage) {
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorFromStorage)) {
                a = i;
            }
        }
        for (int i = a + 1; i < size; i++) {
            patients[i - 1] = patients[i];
        }
        size--;
    }

    public Patient getByID(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return patients[i];
            }
        }
        return null;
    }
}

