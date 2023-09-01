package classwork.chapter2P2;

public class ForEndIfExample {

    public static void main(String[] args) {

        System.out.println("Hello World");

        //Կարի օրինակ 1
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("!");


        //Կարի օրինակ 2
        System.out.print("Hello ");
        System.out.println("World");
        System.out.println("!");


        //Կարի օրինակ 3
        System.out.println(5 + 5);

        //Կարի օրինակ 4
        System.out.println("5 + 5");

        //Կարի օրինակ 5
        int nam = 5;

        //Կարի օրինակ 6
        int nam1;
        nam1 = 5;
        System.out.println("nam1-ի արժեքը = " + nam1);

        //Կարի օրինակ 7
        System.out.println("nam1-ը = " + nam1 + nam1);

        //Կարի օրինակ 8
        System.out.println("nam1-ը = " + (nam1 + nam1));

        //Կարի օրինակ 9
        nam1 = 5 + 5;
        System.out.println("nam1-ը = " + nam1);
        nam1 = 100;
        System.out.println("nam1-ը = " + nam1);
        int age = 10;
        System.out.println("գոիմարը = " + (nam1 + age));

        //Կարի օրինակ 10
        nam1 = 5;
        System.out.println("nam1 = " + nam1);
        nam1 = nam1 * 2;
        System.out.println("nam1 * 2 = " + nam1);

        //Կարի օրինակ 11
        int y, x;
        y = 10;
        x = 20;
        y = y * 2;
        if (y == x) {
            System.out.println("y արդեն հավասար է x-ի");
        }
        if (y > x) {
            System.out.println("y արդեն մեծ է x-ից");
        }
        if (y < x) {
            System.out.println("y փոքր է x-ից");
        }

        //Կարի օրինակ 12
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println(x + " փոքր է " + y);
        }
        //Կարի օրինակ 13
        x = 10;
        y = 20;
        if (x < y) {
            x = x * 2;
        }
        System.out.println(x);

        //Կարի օրինակ 14
        System.out.println("poxos");
        System.out.println("poxos");
        System.out.println("poxos");

        //Կարի օրինակ 15
        for (int i = 0; i < 10; i++) {
            System.out.println("poxos");
        }

        //Կարի օրինակ 16
        int j;
        for (j = 0; j < 10; j++) {
            System.out.println("poxos");
        }
        System.out.println(j);
        System.out.println("petros");
    }
}
