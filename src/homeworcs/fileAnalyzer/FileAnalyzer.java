package homeworcs.fileAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {
    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        String entireTxt = "";
        int quantity = 0;
        Map<String, Integer> map = new HashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String f;
        while ((f = bufferedReader.readLine()) != null) {
            entireTxt += f + " ";
        }
        String[] txt = entireTxt.split(" ");
        for (String word : txt) {
            for (String word2 : txt) {
                if (word2.equals(word)) {
                    quantity++;
                }
            }
            map.put(word, quantity);
            quantity = 0;
        }
        if (map != null) {
            return map;
        }
        return null;
    }

    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        String entireTxt = "";
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String sentence;
        while ((sentence = bufferedReader.readLine()) != null) {
            entireTxt += sentence + " ";
        }
        String[] txt = entireTxt.split(" ");
        if (txt.length != 0) {
            return txt.length;
        }
        return 0;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        int numberOfDistinctOnes = 0;
        int quantity = 0;
        String fulTxt = "";
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String txt;
        while ((txt = bufferedReader.readLine()) != null) {
            fulTxt += txt + " ";
        }
        String[] words = fulTxt.split(" ");
        for (String word : words) {
            for (String word2 : words) {
                if (word2.equals(word)) {
                    quantity++;
                }
            }
            if (quantity == 1) {
                numberOfDistinctOnes++;
                System.out.println(word + " " + numberOfDistinctOnes);
            }
            quantity = 0;
        }
        if (numberOfDistinctOnes != 0) {
            System.out.print("չկրկնվողների ընդանուր քանակը-");
            return numberOfDistinctOnes;
        }
        return 0;
    }


    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        Map<String, Integer> map = new HashMap<>(wordMap(path));
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> ars : map.entrySet()) {
            if (ars.getValue() > n) {
                map2.put(ars.getKey(), ars.getValue());
            }
        }
        if (map2 != null) {
            return map2;
        }
        return null;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        int quantity = 0;
        String fulTxt = "";
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String txt;
        while ((txt = bufferedReader.readLine()) != null) {
            fulTxt += txt + " ";
        }
        String[] words = fulTxt.split(" ");
        for (String word2 : words) {
            if (word2.equals(word)) {
                quantity++;
            }
        }
        if (quantity != 0) {
            System.out.print(word + "-");
            return quantity;
        }
        System.err.println("չկա նման բառ");
        return 0;
    }
}

