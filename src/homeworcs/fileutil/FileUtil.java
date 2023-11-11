package homeworcs.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil implements Commands {

    private static final Scanner scanner = new Scanner(System.in);
    static String filePath = "C:\\Users\\User\\IdeaProjects\\javaCoreA\\src\\homeworcs\\fileutil";
    static File file = new File(filePath);




    public static void main(String[] args) throws IOException {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String sC = scanner.nextLine();
            switch (sC) {
                case EXIT:
                    isRun = false;
                    break;
                case TASK1:
                    fileSearch();
                    break;
                case TASK2:
                    contentSearch();
                    break;
                default:
                    System.out.println("այդպիսի առաջադրանք գոյություն չունի");
                    break;
                case TASK4:
                    printSizeOfPackage();
                    break;


            }
        }
    }


    private static void printCommands() {
        System.out.println("Դուրս գալու համար սեղմեք " + EXIT);
        System.out.println("Առաջին վարժության արդյունքը տեսնելու համար սեղմեք " + TASK1);
        System.out.println("Երկրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK2);
        System.out.println("Երրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK3);
        System.out.println("Չորրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK4);
        System.out.println("Հինգերրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK5);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    private static void fileSearch() {
        boolean b = false;
        System.out.println(file.getAbsoluteFile());
        System.out.println("տվեք ճանապարը");
        String path = scanner.nextLine();
        File file1 = new File(path);
        if (!file1.exists() || file1.isFile()) {
            System.out.println("նման ճանապար գոյությու չունի");
            return;
        }
        System.out.println("տվեք ֆայլի անունը");
        String fileName = scanner.nextLine();
        File[] files = file1.listFiles();
        for (File name : files) {
            if (name.getName().equals(fileName)) {
                b = true;
                System.out.println("կա նման ֆայլ");
                return;
            }
        }
        if (b == false){
            System.out.println("չկա նման ֆայլ");
            return;
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println(file.getAbsoluteFile());
        System.out.println("տվեք ճանապարը");
        String path = scanner.nextLine();
        File file1 = new File(path);
        if (!file1.exists() || file1.isFile() || file1 == null) {
            System.out.println("նման ճանապար գոյությու չունի");
            return;
        }

        System.out.println("տվեք ինչ որ մի բառ");
        String keyword = scanner.nextLine();
        File[] list = file1.listFiles();
        for (File sd : list) {
            if (sd.getName().endsWith(".txt")) {
                System.out.println(sd.getName());
                }
                }
            }





    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println(file.getAbsoluteFile());
        long age = 0;
        System.out.println("տվեք ճանապարը");
        String path = scanner.nextLine();
        File file1 = new File(path);
        if (!file1.exists() || file1.isFile() || file1 == null){
            System.out.println("չկա նման ճանապար");
            return;
        }
        File[] files = file1.listFiles();

        for (File filesName: files) {
              long age1 = filesName.length();
            System.out.println(filesName.getName() + " " + filesName.length());
              age = age1 + age;
        }
        System.out.println("ընդանուր չափսը " + age);

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

    }
}
