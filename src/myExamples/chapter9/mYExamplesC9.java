package myExamples.chapter9;

import java.util.Scanner;

public class mYExamplesC9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 12;
        int b1 = 0;
        boolean isRun = true;


        while (isRun){
            String comand = scanner.nextLine();
            switch (comand){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    boolean b = true;
                    int a1 = 5;
                    while (b == true){
                        int ars = Integer.parseInt(scanner.nextLine());
                        if (ars != a){
                            System.out.println("chka");
                            System.out.println(ars);
                            break;
                        }else {
                            System.out.println("կա");
                            --a1;
                            if (a1 == 0){
                                System.out.println("փորցեկ 5-րոպե անց");
                                b = false;
                            }
                        }
                    }
                    break;
            }
        }

    }
}
