package homeworcs.medicalCenter.storages;

import homeworcs.medicalCenter.doctorsAndPatients.Doctor;
import homeworcs.medicalCenter.doctorsAndPatients.Person;

public class DoctorStorage extends Person {
    private Doctor[] doctors = new Doctor[10];
    private int size = 0;


    public void addDoctors(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        } else {
            doctors[size++] = doctor;
        }
    }

    private void extend() {
        Doctor[] doctors2 = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, doctors2, 0, doctors.length);
        doctors = doctors2;
    }

    public void printDoctors() {
        if (size == 0) {
            System.err.println("բժիշկ չկա");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(doctors[i]);
            }
        }
        return;
    }

    public Doctor getById(String byDoctorID) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(byDoctorID)) {
                return doctors[i];
            }
        }
        return null;
    }


    public void getByProfession(String profession) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                check = true;
                System.out.println(doctors[i]);
            }
        }
        if (check == false) {
            System.err.println("Չկա նման մասնագիտությամպ բժիշկ");
            return;
        }

    }


    public void deletDoctor(String id) {
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                a = i;
            }
        }
        for (int i = a + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }
}
