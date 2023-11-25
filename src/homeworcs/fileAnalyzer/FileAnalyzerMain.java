package homeworcs.fileAnalyzer;

import homeworcs.fileAnalyzer.commands.Commands;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalyzerMain implements Commands {

    static final String path = "C:\\Users\\User\\IdeaProjects\\javaCoreA\\src\\homeworcs\\fileAnalyzer\\ars.txt";
    static Scanner scanner = new Scanner(System.in);
    static FileAnalyzer fileAnalyzer = new FileAnalyzer();

    public static void main(String[] args) throws IOException {
        File file = new File(path);
        boolean isRun = true;
        while (isRun == true) {
            System.out.println(file.getAbsolutePath());
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case TASK1:
                    try {
                        System.out.println(fileAnalyzer.wordMap(path));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case TASK2:
                    try {
                        System.out.println(fileAnalyzer.totalWordCount(path));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case TASK3:
                    try {
                        System.out.println(fileAnalyzer.uniqueWordCount(path));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case TASK4:
                    break;
                case TASK5:
                    System.out.println("խնդրում ենք տվեք ինչ, որ մի բառ");
                    String word = scanner.nextLine();
                    try {
                        System.out.println(fileAnalyzer.countWordOccurrences(path,word));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.err.println("նման հրաման գոյություն չունի");
                    break;
            }
        }
    }
}
