package myExamples.chapter3P2;

public class MyExamplesCh3P2 {

    public static void main(String[] args) {
        //իմ օրինակ
        char c;
        int[] a = {88,99,9,66,33};
        for (int i = 0; i < a.length; i++) {
            c = (char) a[i];
            System.out.print(c + " ");
        }
        System.out.println();

        //double-ի մասիվի օրինակ
        double[] array = {34.65,88.99,876.99,3453,88};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //իմ օրինակ
        int[] ii = new int[10];
        for (int i = 0; i < ii.length; i++) {
            ii[i] = i;
        }
        for (int i = 0; i < ii.length; i++) {
            System.out.print(ii[i] + " ");
        }

    }
}
