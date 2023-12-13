package bookExamples.chaptors2345;

public class Chapter2 {

    public static void main(String[] args) {
        //ինչ, որ բան կանսոլի մեչ տպելու օրինակը
        System.out.println("Hello World");

        // տիպերի և փոփոխականների հետ աշխատելու օրինակը
        int num;
        num = 100;
        num = num * 2;
        System.out.print("Знaчeниe переменной num ");
        System.out.println(num);

        //if-ի հետ աշխատելու օրինակը
        if (num < 100) System.out.println("num меньше 100");
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x-ը փոքր է y-ից");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x-ը հավասար է y-ի");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x-ը մոծ է y-ից");
        }
        if (x == y) {
            System.out.println("այս պատասխանը երբեք չեք տեսնի");
        }

        //for-ի օրինակ
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("i արժոքը " + i);
        }

        //for-ի օրինակ 2
        int x1, y1;
        y1 = 20;
        for (x1 = 0; x1 < 10; x1++) {
            System.out.println("x1-ի արժեքը =" + x1);
            System.out.println("y1-ի արժեքը =" + y1);
            y1 = y1 - 2;
        }
    }
}
