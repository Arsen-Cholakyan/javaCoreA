package homeworcs.homework;

public class Homework {
    public static void main(String[] args) {
        //տնայինի օրինակ 1
        System.out.println("1 րինակ");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println();

        //տնայինի օրինակ 2
        System.out.println("2 օրինակ");
        System.out.println("******\n******\n******\n******\n******\n******");
        System.out.println();

        //տնայինի օրինակ 3
        System.out.println("3 օրինակ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
