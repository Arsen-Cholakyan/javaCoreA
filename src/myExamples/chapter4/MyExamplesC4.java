package myExamples.chapter4;

public class MyExamplesC4 {
    public static void main(String[] args) {

        //+-ի օրինակ
        int a = 10;
        int b = 5;
        a = a + b;
        System.out.println(a);

        //--ի օրինակ
        a = 10;
        b = 1;
        a = a - b;
        System.out.println(a);

        //*-ի օրինակ
        a = 10;
        b = 2;
        a = b * a;
        System.out.println(a);

        ///-ի օրինակ
        a = 10;
        b = 5;
        a = a / b;
        System.out.println(a);

        //%-ի օրինակ
        a = 10;
        b = 2;
        a = a % b;
        System.out.println(a);

        //++-ի օրինակ
        a = 10;
        a++;
        System.out.println(a);

        //+=-ի օրինակ
        a = 10;
        b = 2;
        a += b;
        System.out.println(a);

        //-=-օրինակ
        a = 10;
        b = 2;
        a -= b;
        System.out.println(a);

        //*=-ի օրինակ
        a = 10;
        b = 2;
        a*= b;
        System.out.println(a);

        ///=-ի օրինակ
        a= 10;
        b = 2;
        a /= b;
        System.out.println(a);

        //%=-ի օրինակ
        a = 10;
        b = 2;
        a %= b;
        System.out.println(a);

        a = 10;
        a--;
        System.out.println(a);

        //|-ի իմ օրինակ
        a = 10;
        b = 1;
        if (a == 10 | b == 10){
            System.out.println("a-ն կամ b-ն հավասար են 10-ի");
        }

        //&-ի օրինակ
        a = 10;
        b = 10;
        if (a==10 & b==10){
            System.out.println("a-ն և b-ն հավասար են 10-ի");
        }

        //թիվը թվի հետ & անելու օրինակը
         int c;
         c = a & b;
        System.out.println(c);

        //թիվը թվի հետ | անելու օրինակը
        c = a | b;
        System.out.println(c);

        // >>-ի օրինակ
        a = 32;
        a = a >> 2;
        System.out.println(a);

        //=Ի օրինակ
        a = 10;
        b = 3;
        a = b;
        System.out.println(a);

        //==-ի օրինակ
        a = 40;
        b = 20;
        if (a == b){
            System.out.println("a = b");
        }

        //<-ի օրինակ
        a = 40;
        b = 20;
        if (a < b){
            System.out.println("a < b");
        }

        //>-ի օրինակ
        a = 40;
        b = 20;
        if (a > b){
            System.out.println("a > b");
        }

        //<=-ի օրինակ
            a = 40;
            b = 20;
            if (a <= b){
                System.out.println("a < կամ = b");
            }

        //>=-ի օրինակ
        a = 40;
        b = 20;
        if (a >= b){
            System.out.println("a > կամ = b");
        }

       //!=-ի օրինակ
        a = 40;
        b = 20;
        if (a != b){
            System.out.println("a != b");
        }

        //?:-ի օրինակ
        a = 10;
        int k;
        k = a < 10 ?a++ : a;
        System.out.println(k);
    }
}
