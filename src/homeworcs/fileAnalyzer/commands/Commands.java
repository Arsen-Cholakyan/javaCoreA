package homeworcs.fileAnalyzer.commands;

public interface Commands {

    String EXIT = "0";
    String TASK1 = "1";
    String TASK2 = "2";
    String TASK3 = "3";
    String TASK4 = "4";
    String TASK5 = "5";



    static void printCommands(){
        System.out.println("Դուրս գալու համար սեղմեք " + EXIT);
        System.out.println("1-ին վարժությունը աշխատացնելու համար սեղմեք " + TASK1 + " Читаем файл, составляем мапу слово-количество и возвращаем ее");
        System.out.println("2-րդ վարժությունը աշխատացնելու համար սեղմեք " + TASK2 + " Читаем файл, подсчитываем общее количество слов");
        System.out.println("3-րդ վարժությունը աշխատացնելու համար սեղմեք " + TASK3 + " Читаем файл, подсчитываем количество уникальных слов");
        System.out.println("4-րդ վարժությունը աշխատացնելու համար սեղմեք " + TASK4 + " Читаем файл, находим топ-N часто встречающихся слов");
        System.out.println("5-րդ վարժությունը աշխատացնելու համար սեղմեք " + TASK5 + " Читаем файл, находим количество вхождений слова и возвращаем это число");
    }
}
