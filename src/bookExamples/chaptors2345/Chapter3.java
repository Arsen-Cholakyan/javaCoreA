package bookExamples.chaptors2345;

public class Chapter3 {

    public static void main(String[] args) {

        //օրինակ 1
        char ch1, ch2;

        ch1 = 88;
        ch2 = 'y';
        System.out.print("ch1 և ch2 ");
        System.out.println(ch1 + " " + ch2);

        //օրինակ 2
        char x;
        x = 'x';
        System.out.println("x-ի արժեքը " + x + " է");
        x++;
        System.out.println("x-ի արժոքը դարցավ " + x);

        //օրինակ 3
        boolean b;
        b = false;
        System.out.println("b-ի արժեքը " + b);
        b = true;
        System.out.println("b-ի արժեքը դարցավ " + b);

        if (b) System.out.println("աշխատավ");
        b = false;
        if (b) System.out.println("չի աշխատի");

        System.out.println("10 > 9-ից? " + (10 > 9));


        //օրինակ 4
        if (b == true) {
            System.out.println(b);
        }

        //օրինակ 5
        byte b1;
        int i = 257;
        double d = 323.243;
        System.out.println("int կդարցնենկ byte");
        b1 = (byte) i;
        System.out.println("i և b1 " + i + " " + b1);
        System.out.println("double-ն կդառնա int");
        i = (int) d;
        System.out.println("d և i " + d + " " + i);
        System.out.println("double-ը կդառնա byte");
        b1 = (byte) d;
        System.out.println("b1 և d" + d + " " + b1);

        //օրինակ 6
        int[] montyDys = new int[12];
        montyDys[0] = 31;
        montyDys[1] = 28;
        montyDys[2] = 31;
        montyDys[3] = 31;
        montyDys[4] = 28;
        montyDys[5] = 31;
        montyDys[6] = 31;
        montyDys[7] = 28;
        montyDys[8] = 31;
        montyDys[9] = 31;
        montyDys[10] = 31;
        montyDys[11] = 28;
        System.out.println("Ապրիլի մեջ կա " + montyDys[3] + " օր");

        //օրինակ 7
        int[] montDys1 = {19, 76, 876, 88, 76, 99};
        System.out.println(montDys1[2]);

        //օրինակ 8
        double[] doubles = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int j = 0; j < 5; j++) {
            result = result + doubles[j];
        }
        System.out.println("միջին թվաբանականը = " + result / 5);

        //օրինակ 9
        int[][] twoD = new int[4][5];
        int k = 0;
        for (int j = 0; j < twoD.length; j++) {
            for (int l = 0; l < twoD.length; l++) {
                twoD[j][l] = k;
                k++;
            }
        }
        for (int j = 0; j < twoD.length; j++) {
            for (int l = 0; l < twoD.length; l++) {
                System.out.print(twoD[j][l] + " ");
            }
            System.out.println();
        }

        //օրինակ 10
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];

        int k1 = 0;
        for (int j = 0; j < array.length; j++) {
            for (int l = 0; l < array[j].length; l++) {
                array[j][l] = k1;
                k1++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            for (int l = 0; l < array[j].length; l++) {
                System.out.print(array[j][l] + " ");
            }
            System.out.println();
        }
        System.out.println(array[1][1]);

        //օրինակ 11
        int[][] s = {{12, 23, 99, 98, 0, 88, 11},
                {33, 22, 12, 44, 111, 2342, 11},
                {444, 987, 874, 4, 2, 111, 11, 1}};
        for (int j = 0; j < s.length; j++) {
            for (int l = 0; l < s[j].length; l++) {
                System.out.print(s[j][l] + " ");
            }
            System.out.println();
        }

        //օրինակ 12
        String str = "Աառսեն Չոլաքյան";
        System.out.println(str);

    }
}
