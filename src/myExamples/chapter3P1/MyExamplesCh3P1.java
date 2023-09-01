package myExamples.chapter3P1;

public class MyExamplesCh3P1 {

    public static void main(String[] args) {

        //byte-օրինակը
        byte b = 126;
        System.out.println(b);

        //short-ի օրինակ
        short s = 30500;
        System.out.println(s);

        //int-ի օրինակը
        int i = 1238789099;
        System.out.println(i);

        //long-ի օրինակը
        long l = 78367263;
        System.out.println(l);

        //char-ի օրինակ
        char c = '/';
        char c1 = 'r';
        char c2 = '3';
        char c3 = ' ';
        System.out.println(" " + c + "\n " + c1 + "\n " + c2 + " \n" + c3);


        //float-ի օրինակ
        float f = 47.45f;
        System.out.println(f);

        //double-ի օրինակ
        double d = 5765.774;
        System.out.println(d);

        //boolean-ի օրինակ
        boolean b2 = false;
        System.out.println(b2);

        //փոփոխականների վերագրան օրինակ byte-ի արժեքը տվեցինք int-ին
        int i1 = 10;
        byte b3 = 111;
        i1 = i1 = b3;
        System.out.println(i1);

        i1 = 10000;
        b3 = 10;
        b3 = (byte) i1;
        System.out.println(b3);

        //իրարից շատ տարբերվող տիպերը կարող էնք մեկը մյուսին վերագրել
        char c6 = 'y';
        i1 = 10;
        i1 = (int) c6;
        System.out.println(i1);

        //իմ օրինակ
        System.out.println("Arsen\nCholakyan");

        //իմ օրինակ
        System.out.println("\"");

        //իմ օրինակ
        System.out.println("\" Ars \"\n\" Cholakyan \"");

        //իմ օրինակ
        System.out.println("Ars\\Cholakyan");

    }
}
