package myExamples.chapter6.family;


import java.util.Scanner;


public class FamilyTST {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean b = true;
        while (b) {
            printCommands1();
            Family namesOfFamilyMembers = new Family();
            namesOfFamilyMembers.name = "Arsen";
            System.out.println(namesOfFamilyMembers.name);
            Family namesOfFamilyMembers1 = new Family();
            namesOfFamilyMembers1.name = "Arax";
            System.out.println(namesOfFamilyMembers1.name);
            Family namesOfFamilyMembers2 = new Family();
            namesOfFamilyMembers2.name = "Alisa";
            System.out.println(namesOfFamilyMembers2.name);
            Family namesOfFamilyMembers3 = new Family();
            namesOfFamilyMembers3.name = "Vardan";
            System.out.println(namesOfFamilyMembers3.name);
            System.out.println("հրաման");
            String comand = scanner.nextLine();
            switch (comand) {
                case "0":
                    b = false;
                    break;
                case "1":
                    System.out.println("Ում անունը գուզեք տաք");
                    String name = scanner.nextLine();
                    if (name.equals(namesOfFamilyMembers.name) || name.equals(namesOfFamilyMembers1.name) || name.equals(namesOfFamilyMembers2.name) || name.equals(namesOfFamilyMembers3.name)) {
                        System.out.println("կա նման անուն");
                        System.out.println("Տվեք ազգանունը");
                        String surname = scanner.nextLine();
                        System.out.println("տվեք հայրանունը");
                        String dadeName = scanner.nextLine();
                        System.out.println("Տվեք տարիքը");
                        String age = scanner.nextLine();
                        Family family = new Family(name, surname, dadeName, age);
                        System.out.println(family.name + " " + family.surname + " " + family.dadeName + " " + family.age);
                    } else {
                        System.err.println(name + " " + "չկա նման անուն");
                    }
                    break;
                default:
                    System.err.println(comand + " " + "չկա նման հրաման");
            }
            if (b == false) {
                return;
            }
        }
    }

    private static void printCommands1() {
        System.out.println("դուրս գալու համար սեխմել 0");
        System.out.println("աշխատանք կատարելու համար սեխմեք 1");
    }
}






