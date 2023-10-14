package homeworcs.medicalCenter.main;

import homeworcs.medicalCenter.doctorsAndPatients.Doctor;
import homeworcs.medicalCenter.doctorsAndPatients.Patient;
import homeworcs.medicalCenter.storages.DoctorStorage;
import homeworcs.medicalCenter.storages.PatientStorage;
import java.util.Scanner;

public class DoctorAndPatientMain {

    static Scanner scanner = new Scanner(System.in);
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommandes();
            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    doctorsRegister();
                    break;
                case "2":
                    searchByProfession();
                    break;
                case "3":
                    deletDctors();
                    break;
                case "4":
                    changeDoctor();
                    break;
                case "5":
                    registerPatient();
                    break;
                case "6":
                    printAllPatiendsById();
                    break;
                case "7":
                    patientStorage.print();
                    break;
                case "8":
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
        }else {
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
        }else {
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
            }else {
                System.out.println("տվեք ձեր ID-ին");
                while (true){
                    String patientId = scanner.nextLine();
                    Patient patientsFromStorage = patientStorage.getByID(patientId);
                    if (patientsFromStorage != null){
                        System.err.println("այդպիսի ID-ով արդեն անձ կա");
                        --experience;
                        if (experience == 0){
                            System.out.println("փորցոկ 10-րոպե հետո");
                            return;
                        }
                    }else {
                        System.out.println("տվեք ձեր անունը");
                        String name = scanner.nextLine();
                        System.out.println("տվեք ձեր ազգանունը");
                        String surname = scanner.nextLine();
                        System.out.println("տվեք ձեր հեռախոսահամարը");
                        int phone = Integer.parseInt(scanner.nextLine());
                        System.out.println("օր ժամ ամիս ");
                        String registerDateTime = scanner.nextLine();
                        Patient patient = new Patient(patientId,name,surname,phone,doctorFromStorage,registerDateTime);
                        patientStorage.addPatients(patient);
                        return;
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
        System.out.println("դուրս գալ։ Սեխմեք - 0");
        System.out.println("բժշկի գրանցում։ Սեխմել - 1");
        System.out.println("մասնագիտությամբ բժիշկ որոնել։ Սեխմել 2");
        System.out.println("ջնջել բժշկին id-ով: Սեխմել 3");
        System.out.println("փոխել բժշկին ըստ ID-ի: Սեխմել 4");
        System.out.println("ավելացնել հիվանդին: Սեխմել 5");
        System.out.println("տպել բոլոր հիվանդներին բժշկի կողմից: Սեխմել 6");
        System.out.println("տպել բոլոր հիվանդներին: սեխմել 7");
        System.out.println("ցույց տալ բոլոր բժիշկներին։ Սեխմել 8");
    }
}
