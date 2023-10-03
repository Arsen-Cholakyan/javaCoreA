package homeworcs.employee;

public class EmployeeStorage {
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
            if (employees[i].getEmplyeeID().equals(IDVerification)) {
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
            if (employees[i].getCompany().equals(companyName)) {
                System.out.println("անունը -" + employees[i].getName() + " " + " ազգանունը -" + employees[i].getSurname() + " " +
                        " ID-ին -" + employees[i].getEmplyeeID() + " " + " աշխատավարձի չափսը -" + employees[i].getSalary() + " " + " ընկերություն -" + employees[i].getCompany() +
                        " " + " ոլորտ -" + employees[i].getPosition() + " " + " տարիքը -" + employees[i].getAge() + " " + " տարեթիվը -" + employees[i].getBirthNumber());
            }
        }
        System.out.println();
    }

}
