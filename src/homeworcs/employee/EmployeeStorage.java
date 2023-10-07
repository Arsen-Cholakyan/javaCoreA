package homeworcs.employee;

import java.util.Scanner;

public class EmployeeStorage {
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();
    Employee[] employees = new Employee[10];
    private int size = 0;


    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        } else {
            employees[size++] = employee;
        }
    }

    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }

    public void print() {
        System.out.println("ԲՈԼՈՐ ԱՇԽԱՏԱԿԻՑՆԵՐԸ");
        for (int i = 0; i < size; i++) {

            System.out.println("անունը -" + employees[i].getName() + " " + " ազգանունը -" + employees[i].getSurname() + " " +
                    " ID-ին -" + employees[i].getEmplyeeID() + " " + " աշխատավարձի չափսը -" + employees[i].getSalary() + " " + " ընկերություն -" + employees[i].getCompany() +
                    " " + " ոլորտ -" + employees[i].getPosition() + " " + " տարիքը -" + employees[i].getAge() + " " + " տարեթիվը -" + employees[i].getBirthNumber());

        }
        System.out.println();
    }

    public void search(String IDVerification) {
        System.out.println("ԲՈԼՈՐ ԱՇԽԱՏԱԿԻՑՆԵՐԸ");
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(IDVerification)) {
                System.out.println("անունը -" + employees[i].getName() + " " + " ազգանունը -" + employees[i].getSurname() + " " +
                        " ID-ին -" + employees[i].getEmplyeeID() + " " + " աշխատավարձի չափսը -" + employees[i].getSalary() + " " + " ընկերություն -" + employees[i].getCompany() +
                        " " + " ոլորտ -" + employees[i].getPosition() + " " + " տարիքը -" + employees[i].getAge() + " " + " տարեթիվը -" + employees[i].getBirthNumber());
            }
        }
        System.out.println();
    }

    public void search1(String companyName) {
        System.out.println("ԲՈԼՈՐ ԱՇԽԱՏԱԿԻՑՆԵՐԸ");
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println("անունը -" + employees[i].getName() + " " + " ազգանունը -" + employees[i].getSurname() + " " +
                        " ID-ին -" + employees[i].getEmplyeeID() + " " + " աշխատավարձի չափսը -" + employees[i].getSalary() + " " + " ընկերություն -" + employees[i].getCompany() +
                        " " + " ոլորտ -" + employees[i].getPosition() + " " + " տարիքը -" + employees[i].getAge() + " " + " տարեթիվը -" + employees[i].getBirthNumber());
            }
        }
        System.out.println();
    }


    public void search2(String IDVerification2) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().equals(IDVerification2)) {
                b = true;
                System.out.println("Անուն");
                employees[i].setName(scanner.nextLine());
                System.out.println("Ազգանուն");
                employees[i].setSurname(scanner.nextLine());
                System.out.println("Գումար");
                employees[i].setSalary(scanner.nextLine());
                System.out.println("Ընկերություն");
                employees[i].setCompany(scanner.nextLine());
                System.out.println("Ոլերտ");
                employees[i].setPosition(scanner.nextLine());
                System.out.println("Տարիք");
                employees[i].setAge(scanner.nextInt());
                System.out.println("Տարեթիվ");
                employees[i].setBirthNumber(scanner.nextInt());
            }
        }
        if (b == false){
            System.out.println("չկա նաման ID");
        }
    }
}

