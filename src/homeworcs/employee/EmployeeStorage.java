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

    public void companyEmployee(String IDVerification) {
        System.out.println(" ԱՇԽԱՏԱԿԻՑԸ");
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(IDVerification)) {
                System.out.println("անունը -" + employees[i].getName() + " " + " ազգանունը -" + employees[i].getSurname() + " " +
                        " ID-ին -" + employees[i].getEmplyeeID() + " " + " աշխատավարձի չափսը -" + employees[i].getSalary() + " " + " ընկերություն -" + employees[i].getCompany() +
                        " " + " ոլորտ -" + employees[i].getPosition() + " " + " տարիքը -" + employees[i].getAge() + " " + " տարեթիվը -" + employees[i].getBirthNumber());
            }
        }
        System.out.println();
    }

    public void companyEmployees(String companyName) {
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


    public void DeleteById(String IDVerification2) {
        int ars = 0;
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().contains(IDVerification2)) {
                b = true;
                ars = i;
                --size;
                for (int j = ars; j < size; j++) {
                    employees[j].setName(employees[j+1].getName());
                    employees[j].setSurname(employees[j+1].getSurname());
                    employees[j].setEmplyeeID(employees[j+1].getEmplyeeID());
                    employees[j].setSalary(employees[j+1].getSalary());
                    employees[j].setCompany(employees[j+1].getCompany());
                    employees[j].setPosition(employees[j+1].getPosition());
                    employees[j].setAge(employees[j+1].getAge());
                    employees[j].setBirthNumber(employees[j+1].getBirthNumber());
                }
            }
        }
        if (b == false){
            System.out.println("չկա նման ID");
        }
    }
}

