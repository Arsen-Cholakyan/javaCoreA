package homeworcs.medicalCenter.main;

import homeworcs.medicalCenter.doctorsAndPatients.Doctor;
import homeworcs.medicalCenter.doctorsAndPatients.Patient;
import homeworcs.medicalCenter.storages.Command;
import homeworcs.medicalCenter.storages.DoctorStorage;
import homeworcs.medicalCenter.storages.PatientStorage;

import java.util.Date;
import java.util.Scanner;

public class DoctorAndPatientMain implements Command{

    static Scanner scanner = new Scanner(System.in);
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();



    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommandes();
            String commands = scanner.nextLine();
            switch (commands) {
                case Exit:
                    isRun = false;
                    break;
                case DOCTOR_REGISTRATION:
                    doctorsRegister();
                    break;
                case TO_SEARCH_FOR_A_DOCTOR_BY_PROFESSION:
                    searchByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deletDctors();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctor();
                    break;
                case ADD_PATIENT:
                    registerPatient();
                    break;
                case PATIENT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatiendsById();
                    break;
                case PATIENT_ALL_PATIENTS:
                    patientStorage.print();
                    break;
                case PATIENT_ALL_DOCTORS:
                    doctorStorage.printDoctors();
                    break;
                default:
                    System.err.println("Այդպիսի հրաման գոյություն չունի\n Խնդրում ոնք նորից փորցեկ ");
            }
        }
    }

    private static void deletDctors() {
        doctorStorage.printDoctors();
        System.out.println("բժշկին ջնջելու համար տվեք իրա ID");
        String id = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(id);
        if (doctorFromStorage == null) {
            System.out.println("չկա նման ID-ով բժիշկ");
            return;
        } else {
            doctorStorage.deletDoctor(id);
            patientStorage.deletPatient(doctorFromStorage);
            return;
        }
    }

    private static void printAllPatiendsById() {
        doctorStorage.printDoctors();
        System.out.println("տվեք ID");
        String id = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(id);
        if (doctorFromStorage == null) {
            System.out.println("չկա նման ID-ով բժիշկ");
            return;
        } else {
            patientStorage.prinpAllPatientBYId(doctorFromStorage);
        }
    }


    private static void registerPatient() {
        int experience = 4;
        doctorStorage.printDoctors();
        System.out.println("ընդրեք ձեր ուզած բժշկի Id");
        while (true) {
            String id = scanner.nextLine();
            Doctor doctorFromStorage = doctorStorage.getById(id);
            if (doctorFromStorage == null) {
                System.err.println("նման ID-ով բժիշկ գոյություն չունի");
                --experience;
                if (experience == 0) {
                    System.out.println("փորցոկ 10-րոպե հետո");
                    return;
                }
            } else {
                System.out.println("տվեք ձեր ID-ին");
                while (true) {
                    String patientId = scanner.nextLine();
                    Patient patientsFromStorage = patientStorage.getByID(patientId);
                    if (patientsFromStorage != null) {
                        System.err.println("այդպիսի ID-ով արդեն անձ կա");
                        --experience;
                        if (experience == 0) {
                            System.out.println("փորցոկ 10-րոպե հետո");
                            return;
                        }
                    } else {
                        System.out.println("տվեք ձեր անունը");
                        String name = scanner.nextLine();
                        System.out.println("տվեք ձեր ազգանունը");
                        String surname = scanner.nextLine();
                        System.out.println("տվեք ձեր հեռախոսահամարը");
                        int phone = Integer.parseInt(scanner.nextLine());
                        System.out.println("օր ժամ ամիս ");
                        Date registerDateTime = new Date();
                        Patient dateTyTime = patientStorage.data(registerDateTime);
                        if (dateTyTime == null){
                            Patient patient = new Patient(patientId, name, surname, phone, doctorFromStorage, registerDateTime);
                            patientStorage.addPatients(patient);
                            return;
                        }else {
                            System.err.println("արդեն զբաղված է");
                            return;
                        }

                    }
                }

            }
        }

    }

    private static void changeDoctor() {
        System.out.println("տվեք ID-ին");
        String id = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(id);
        if (doctorFromStorage != null) {
            System.out.println("տվեք անունը");
            String name = scanner.nextLine();
            doctorFromStorage.setName(name);
            System.out.println("տվեք ազգանունը");
            String surname = scanner.nextLine();
            doctorFromStorage.setSurname(surname);
            System.out.println("տվեք email-ը");
            String email = scanner.nextLine();
            doctorFromStorage.setEmail(email);
            System.out.println("տվեք հեռախոսահամարը");
            int phone = Integer.parseInt(scanner.nextLine());
            doctorFromStorage.setPhone(phone);
            System.out.println("տվեք մասնագիտությունը");
            String profession = scanner.nextLine();
            doctorFromStorage.setProfession(profession);
        } else {
            System.err.println("Այդպիսի գոյություն չունի");
        }
    }

    private static void searchByProfession() {
        System.out.println("խնդրում ենք տվեք մասնագիտությունը");
        String profession = scanner.nextLine();
        doctorStorage.getByProfession(profession);
    }

    private static void doctorsRegister() {
        int experience = 4;
        System.out.println("խնդրում ենք տվեկ ձեր ID-ին");
        while (true) {
            String id = scanner.nextLine();
            Doctor doctorFromStorage = doctorStorage.getById(id);
            if (doctorFromStorage != null) {
                System.err.println("նման ID-ով բժիշկ արդեն գոյություն ունի");
                --experience;
                if (experience == 0) {
                    System.out.println("փորցոկ 10-րոպե հետո");
                    return;
                }
            } else {
                System.out.println("խնդրում ենք տվեկ ձեր անունը");
                String name = scanner.nextLine();
                System.out.println("խնդրում ենք տվեկ ձեր ազգանունը");
                String surname = scanner.nextLine();
                System.out.println("խնդրում ենք տվեկ ձեր email-ը");
                String email = scanner.nextLine();
                System.out.println("խնդրում ենք տվեկ ձեր հեռախոսահամարը");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("խնդրում ենք տվեկ ձեր մասնագիտությունը");
                String profession = scanner.nextLine();
                Doctor doctor = new Doctor(id, name, surname, email, phone, profession);
                doctorStorage.addDoctors(doctor);
                System.out.println("դուք հաջողությամբ գրանցվեցիկ\nԲարի Գալուստ");
                System.out.println();
                return;

            }
        }
    }

    private static void printCommandes() {
        System.out.println("դուրս գալ։ Սեխմեք -" + Exit);
        System.out.println("բժշկի գրանցում։ Սեխմել - " + DOCTOR_REGISTRATION);
        System.out.println("մասնագիտությամբ բժիշկ որոնել։ Սեխմել" +TO_SEARCH_FOR_A_DOCTOR_BY_PROFESSION );
        System.out.println("ջնջել բժշկին id-ով: Սեխմել " + DELETE_DOCTOR_BY_ID);
        System.out.println("փոխել բժշկին ըստ ID-ի: Սեխմել " + CHANGE_DOCTOR_BY_ID);
        System.out.println("ավելացնել հիվանդին: Սեխմել " + ADD_PATIENT);
        System.out.println("տպել բոլոր հիվանդներին բժշկի կողմից: Սեխմել " + PATIENT_ALL_PATIENTS_BY_DOCTOR);
        System.out.println("տպել բոլոր հիվանդներին: սեխմել " + PATIENT_ALL_PATIENTS);
        System.out.println("ցույց տալ բոլոր բժիշկներին։ Սեխմել " + PATIENT_ALL_DOCTORS);
    }
}
