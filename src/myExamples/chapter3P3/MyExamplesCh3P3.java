package myExamples.chapter3P3;

public class MyExamplesCh3P3 {
    public static void main(String[] args) {

        //իմ օրինակ 1
        int i = 5;
        int[] ars = new int[i];
        for (int j = 0; j <i ; j++) {
            ars[j] = j;
            System.out.print(ars[j] + " ");
        }
        System.out.println();

        //օրինակ 1
        //մասիվի հայտարարելու 1 ձև
        char [] i1   = new char[2];


        //մասիվի հայտարարելու 2 ձև
        int[] d = {12,87,38,98,88,90};


        //իմ օրինակ 2
        int[] d1 = {12,87,38,98,88,90};
        d1[2] = d1[2] * 2;
        System.out.println(d1[2]);

        //իմ օրինակ 3
        int[] arsen = {12,66,88,99};
        int[] arsen1 = {12,77,88,77};
        for (int j = 0; j < arsen.length ; j++) {
            if (arsen[j] == arsen1[j]){
                System.out.println(arsen[j]+ " = " + arsen1[j]);
            }
        }

        //իմ օրինակ 4
        int[] b = {13,54,87,};
        char[] c = {'j', 'u', '@', 't'};
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " | ");
            System.out.print(c[j] + " | ");
        }
        System.out.println(c[c.length -1] + " |");

       //իմ օրինակ 5
        int[] f = {45,88,77,77};
        char[] h = {'u', 'p', '|'};
        if (f.length > h.length){
            for (int j = 0; j < h.length; j++) {
                System.out.print(f[j] + " | ");
                System.out.print(h[j] + " | ");
            }
            if (h.length > f.length){
                for (int j = 0; j < f.length; j++) {
                    System.out.print(f[j] + " | ");
                    System.out.print(h[j] + " | ");
                }
            }
        }
        System.out.println();

        //իմ օրինակ 6
        int[][] array = new int[4][6];
        for (int j = 0; j < array.length; j++) {
            int t = j;
            for (int k = 0; k < array[j].length; k++) {
                array[j][k] = t;
                t++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }

        //իմ օրինակ 7
        String s = "Arsen \nCholakyan";
        System.out.println(s);

    }
}
