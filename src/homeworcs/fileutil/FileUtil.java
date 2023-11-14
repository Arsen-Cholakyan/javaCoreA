package homeworcs.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil implements Commands {

    private static final Scanner scanner = new Scanner(System.in);
    static String path = "C:\\Users\\User\\IdeaProjects\\javaCoreA\\src\\homeworcs\\fileutil";
    static File file = new File(path);


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
                case TASK3:
                    findLines();
                    break;
                case TASK4:
                    printSizeOfPackage();
                    break;
                case TASK5:
                    createFileWithContent();
                    break;
                default:
                    System.err.println("այդպիսի առաջադրանք գոյություն չունի");
            }
        }
    }


    private static void printCommands() {
        System.out.println("Դուրս գալու համար սեղմեք " + EXIT);
        System.out.println("Առաջին վարժության արդյունքը տեսնելու համար սեղմեք " + TASK1 + " fileSearch()");
        System.out.println("Երկրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK2 + " contentSearch()");
        System.out.println("Երրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK3 + " findLines()");
        System.out.println("Չորրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK4 + " printSizeOfPackage()");
        System.out.println("Հինգերրորդ վարժության արդյունքը տեսնելու համար սեղմեք " + TASK5 + "createFileWithContent()");
        System.out.println("!!!!!!Խորհուրդ կտամ սքսել 5-րդ վարժությունից որովհետև հնարաոր է ոչ ֆայլ լինի ոչ ֆայլի մեջ տեքստ" + TASK5);
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
            System.err.println("նման ճանապար գոյությու չունի");
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
        if (b == false) {
            System.err.println("չկա նման ֆայլ");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        boolean b = false;
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
        for (File failName : list) {
            if (failName.getName().endsWith(".txt")) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(failName));
                String txt;
                while ((txt = bufferedReader.readLine()) != null) {
                    if (txt.equals(keyword)) {
                        b = true;
                        System.out.println(failName.getName());
                    }
                }
                bufferedReader.close();
            }
        }
        if (b == false) {
            System.err.println("չկա նման տեքստով ֆայլ");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        boolean b = false;
        System.out.println(file.getAbsolutePath());
        System.out.println("տվեք ֆայլի անունը");
        String txtPath = scanner.nextLine();
        String newPhat = path + File.separator + txtPath;
        File file1 = new File(newPhat);
        if (file1.exists() == false) {
            System.err.println("չկա նաման ֆայլ");
        } else {
            System.out.println("կա նման ֆայլ");
            System.out.println("տվեք ինչ որ մի բառ");
            String keyword = scanner.nextLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String s = "";
            int lain = 0;
            while ((s = bufferedReader.readLine()) != null) {
                lain++;
                if (s.equals(keyword)) {
                    System.out.println(lain + "-րդ տող " + " " + s);
                    b = true;
                }
            }
            bufferedReader.close();
        }
        if (b == false) {
            System.err.println("չկա նման տեքստ");
        }

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
        if (!file1.exists() || file1.isFile() || file1 == null) {
            System.out.println("չկա նման ճանապար");
            return;
        }
        File[] files = file1.listFiles();

        for (File filesName : files) {
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

    static void createFileWithContent() throws IOException {
        System.out.println(file.getAbsolutePath());
        System.out.println("տվեք պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը");
        String path = scanner.nextLine();
        File file1 = new File(path);
        if (!file1.exists() || file1.isFile()) {
            System.err.println("Կամ այդպիսի ճանապար գոյություն չունի կամ էլ ճանապարի վերջում ֆայլի անուն էք տվել!!!!!!");
        } else {
            System.out.println("տվեք ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու");
            String fileName = scanner.nextLine();
            String path2 = path + File.separator + fileName;
            File file2 = new File(path2);
            if (file2.exists() == false) {
                file2.createNewFile();
                System.out.println("սարքվել է նոր ֆայլ " + fileName);
            } else {
                System.out.println("կար նման ֆայլ");
            }
            File[] files = file1.listFiles();
            for (File f : files) {
                if (f.getName().equals(fileName)) {
                    System.out.println("տվեք ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու: մնաց 4");
                    String content = scanner.nextLine();
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
                    //Այս մասը գրում եմ նրա համար որ մյուս մեթոդներն էլ լիովին աշխատին։
                    bufferedWriter.write(content + "\n");
                    System.out.println("մեկ հատ էլ տեքստ տվեք մնաց 3");
                    String content1 = scanner.nextLine();
                    bufferedWriter.write(content1 + "\n");
                    System.out.println("մեկ հատ էլ տեքստ տվեք մնաց 2");
                    String content2 = scanner.nextLine();
                    bufferedWriter.write(content2 + "\n");
                    System.out.println("մեկ հատ էլ տեքստ տվեք մնաց 1");
                    String content3 = scanner.nextLine();
                    bufferedWriter.write(content3 + "\n");
                    bufferedWriter.close();
                    System.out.println("տեքստրը արդեն գրվել է ֆայլի մեջ կարող էք ստուգել ։)");
                }
            }
        }
    }
}

