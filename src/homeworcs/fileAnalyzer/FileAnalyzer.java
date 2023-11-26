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
        int quantity = 0;
         Map<String,Integer> map = new HashMap<>(wordMap(path));
        for (Map.Entry<String,Integer> words: map.entrySet()) {
            quantity += words.getValue();
        }
        return quantity;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        int one = 1;
        int numberOfUnique = 0;
        Map<String,Integer>map = new HashMap<>(wordMap(path));
        for (Map.Entry<String,Integer> words:map.entrySet()) {
             if (words.getValue() == one){
                 numberOfUnique++;
             }
        }
     return numberOfUnique;
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
          Map<String,Integer> map = new HashMap<>(wordMap(path));
        for (Map.Entry<String,Integer> words:map.entrySet()) {
            if (words.getKey().equals(word)){
                System.out.print(words.getKey() + "-");
                return words.getValue();
            }
        }
        System.out.println("չկա նման բառ");
       return 0;
    }
}

