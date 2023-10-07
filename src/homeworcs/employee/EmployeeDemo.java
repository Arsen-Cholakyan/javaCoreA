package homeworcs.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        System.out.println("Բարի գալուստ");
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String s = scanner.nextLine();
            switch (s) {
                case "0":
                    isRun = exitingTheProgram();
                    break;
                case "1":
                    login();
                    break;

                case "2":
                    allEmployees();
                    break;

                case "3":
                    showTheEmployee();
                    break;


                case "4":
                    employeesOfTheCompany();
                    break;

                case "5":
                    deleteTheEmployee();
                    break;

                default:
                    System.err.println("դուք սխալ բան եք սեխմել․ փորցեք նորից!");
                    break;
            }
        }
    }

    private static boolean exitingTheProgram() {
        boolean isRun;
        isRun = false;
        System.err.println("դուք դուրս եկաք կայքից");
        return isRun;
    }

    public static void printCommands() {
        System.out.println("դուրս գալու համար սեխմեք 0");
        System.out.println("եթե ուզում եք գործի ընդունվել սեխմեք 1 ");
        System.out.println("եթե ուզում եք տեսնել բոլոր աշխատակիցներին սեխմեք 2 ");
        System.out.println("եթե ուզում եք կոնկրետ աշխատակիցին տեսնել տվեք իրա ID-ն։ID-ն տալու համար ցեխմեք 3 ");
        System.out.println("եթե ուզում եք տեսնել ինչ, որ մի ընկերության աշխատակիցներին տվեք ընկերության անունը։Ընկերության անունը տալու համար սեխմեք 4");
        System.out.println("եթե ուզում եք ջնջել աշխատակցին սեխմել 5");
    }


    public static void login() {
        System.out.println("խնդրում ենք գրեք ձեր անունը");
        String name = scanner.nextLine();
        System.out.println("խնդրում ենք գրեք ձեր ազգանունը");
        String surname = scanner.nextLine();
        System.out.println("քանի տարեկան եք");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("նշեք ձեր ծննդյան տարեթիվը");
        int birthNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("խնդրում ենք գրեք ձեր ID");
        String emplyeeID = scanner.nextLine();
        System.out.println("ինչ չափսի գումարով պետք է աշխատեք ");
        String salary = scanner.nextLine();
        System.out.println("որ ընկերությունում եք ուզում աշխատել ");
        String company = scanner.nextLine();
        System.out.println("բնագավառով ինչ գուզեք աշխատիք");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, emplyeeID, salary, company, position, age, birthNumber);
        employeeStorage.add(employee);
        System.out.println("դոք հաջողությամբ գրանցվեցիք");
        System.out.println();
    }


    public static void allEmployees() {
        System.out.println("--------------------");
        employeeStorage.print();
        System.out.println("--------------------");
    }


    public static void showTheEmployee() {
        System.out.println("գրեք ID");
        String IDVerification = scanner.nextLine();
        employeeStorage.search(IDVerification);
    }


    public static void employeesOfTheCompany() {
        System.out.println("տվեք ընկերության անունը");
        String companyName = scanner.nextLine();
        employeeStorage.search1(companyName);
    }


    public static void deleteTheEmployee() {
        System.out.println("աշխատակցին ջնջելու համար տվեք իրա ID");
        String IDVerification2 = scanner.nextLine();
        employeeStorage.search2(IDVerification2);
    }
}
