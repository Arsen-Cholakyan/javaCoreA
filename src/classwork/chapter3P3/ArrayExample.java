package classwork.chapter3P3;

public class ArrayExample {
    public static void main(String[] args) {

        //1 օրինակ
        int a = 6;
        int b = 5;
        int g = 8;
        a = b + g;
        int[] ars = new int[a];
        for (int i = 0; i < a; i++) {
            ars[i] = i;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(ars[i] + " ");
        }
        System.out.println();

        //2 օրինակ
        int[] numbers = {3,6,1,7,9,2,8};
        System.out.println(numbers[0]);

        //3 օրինակ
        char[] chars = {'a','b','z'};
        System.out.println(chars[1]);

        //4 օրինակ
        double[] doubles = {5,7,8,5.9};
        System.out.println(doubles[0]);

        //5 օրինակ
        System.out.println(doubles);

        //6 օրինակ
        System.out.println(doubles.length);

        //7 օրինակ
        System.out.println(doubles .length - 1);

        //8 օրինակ
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " | ");
        }
        System.out.println();
        
        //9 օրինակ
        int[] arsen = {12,34,56};
        char[] arsen1 = {'p', '@', '4'};
        for (int i = 0; i < arsen.length; i++) {
            System.out.println(arsen[i] + " ");
            System.out.println(arsen1[i] + " ");
        }

        //10 օրինակ 
        double[] doubles1 = {10.1, 11.2, 12.3, 13.4, 14.5};
        double sum = 0;
        for (int i = 0; i < doubles.length; i++) {
            sum = sum + doubles1[i];
        }
        System.out.println(sum / 5);
        System.out.println(sum / doubles1.length);

        //11 օրինակ
        char[] name = {'p','o','x','o','s'};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        System.out.println();

        //12 օրինակ
        String name1 = "poxos";
        System.out.println(name1);

        //13 օրինակ
        String string = "Arsen";
        char[] chars1 = string.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i] + " ");
        }
        System.out.println();

        //14 օրինակ
        String string1 = "Cholakyan";
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            System.out.print(c + " ");
        }
        System.out.println();

        //15 օրինակ
        char[] f = {'p','i','|'};
        String string2 = new String(f);

        System.out.println(string2);

        //16 օրինակ
        String string3 = "1234";
        int a3 = Integer.parseInt(string3);
        System.out.println(a3);
        System.out.println(a3 * 2);

    }
}
