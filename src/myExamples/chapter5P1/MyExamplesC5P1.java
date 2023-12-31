package myExamples.chapter5P1;

public class MyExamplesC5P1 {
    public static void main(String[] args) {

        //if-ի օրինակը
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a-ն մեծ է b-ից");
        }

        //if-else-ի օրինակ
        a = 30;
        b = 40;
        if (a > b) {
            System.out.println(a);
        } else {
            a += 11;
            System.out.println("a-ն գործողության շնորհիվ մեծացավ b-ից " + a);
        }

        //if-else-if-ի օրինակ
        a = 18;
        b = 30;
        if (a > b) {
            System.out.println("a-ն մեծ է b-ից");
        } else if (b > a) {
            System.out.println("b-ն մեծ է a-ից");
        } else {
            System.out.println("երկու պաիմանն էլ false վերադարցրեցին");
        }

        //do wile-ի օրինակ
        int o = 10;
        do {
            System.out.print(o + " ");
            o--;
        } while (o > 0);

        System.out.println();

        //for-ի օրինակ
        for (int i = 0; i < 4; i++) {
            System.out.print("|" +"ars" + "|");
        }
        System.out.println();


        //!-ի օրինակ
        boolean d = false;
        boolean b1 = !d;
        System.out.println(b1);

        //իմ օրինակ
        boolean f = true;
        int or  = 0;
        for (; f ;) {
            or++;
            if (or == 11){
                break;
            }
            System.out.println(or);
        }

    }
}

