package classwork.chapter3P2;

public class ArrayExample {

    public static void main(String[] args) {

        //Կարի օրինակ 1
        int[] numbers = new int[5];
        System.out.println(numbers);

        //Կարի օրինակ 2
        int[] numbers1 = new int[5];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        numbers1[3] = 4;
        numbers1[4] = 5;

        //Կարի օրինակ 3

        int[] ar = {546,87,98,43,};
        for (int i = 0; i < 4; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
