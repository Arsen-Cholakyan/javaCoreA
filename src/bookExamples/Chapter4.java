package bookExamples;

public class Chapter4 {
    public static void main(String[] args) {

        // գրքի 1-ին օրինակ
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = - d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //գրքի 2-ին օրինակ
        double da = 1 + 1;
        double db = da * 2;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

       //գրքի 3-րդ օրինակ
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        //գրքի 4-րդ օրինակ
        int a1 = 1;
        int b1 = 2;
        int c1 = 3;
        a1 += 5;
        b1 *= 4;
        c1 += a * b1;
        c1 %= 6;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);

        //գրքի 5-րդ օրինակ
        int x1 = 0;
        x1 = x1 + 1;
        System.out.println(x1);
        x1++;
        System.out.println("x1 = " + x1);

        //գրքի 5-րդ օրինակ
        int x2 = 10;
        int y1;
        y1 = x2++;
        System.out.println(y1);

        //գրքի 6-րդ օրինակ
        int x4 = 10;
        int y2;
        y2 = ++x4;
        System.out.println(y2);

        //գրքի 7-րդ օրինակ
        int a2 = 1;
        int b2 = 2;
        int c2 ;
        int d3;
        c2 = ++b2;
        d3 = a2++;
        c2++;

        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        System.out.println("c2 = " + c2);
        System.out.println("d3 = " + d3);

        // գրքի խառը օրինակ
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        byte b4 =(byte) 0xf1;
        byte c4 =(byte) (b4 >> 4);
        byte d4 = (byte) (b4 >>> 4);
        byte e4 = (byte) ((b4 & 0xf1) >> 4);
        System.out.println("b4 = 0x" + hex[(b4 >>4) & 0x0f] + hex[b4 & 0x0f]);
        System.out.println("b4 >> 4 = 0x" + hex[(c4 >> 4) & 0x0f] + hex[c4 & 0x0f]);
        System.out.println("b4 >>> 4  = 0x" + hex[(d4 >> 4) & 0x0f] + hex[d4 & 0x0f]);
        System.out.println("(b4 & 0xff) >> 4 = 0x" + hex[(e4 >> 4) & 0x0f] + hex[e4 &0x0f]);

        //գրքի պարզ օրինակ
        int a3 = 1;
        int b3 = 2;
        int c3 = 3;
        a3 |= 4;
        b3 >>= 1;
        c3 <<= 1;
        a3 ^= c3;
        System.out.println("a3 = " + a3);
        System.out.println("b3 = " + d3);
        System.out.println("c3 = " + c3);

        //գրքի օրինակ
        boolean a6 = true;
        boolean b6 = false;
        boolean c6 = a6 | b6;
        boolean d6 = a6 & b6;
        boolean e6 = a6 ^ b6;
        boolean f6 = (!a6 & b6) | (a6 & !b6);
        boolean g6 = !a6;

        System.out.println("       a6 = " + a6);
        System.out.println("       b6 = " + b6);
        System.out.println("      a6 | b6 = " + c);
        System.out.println("      a6 & b6 = " + d6);
        System.out.println("      a6 ^ b6 = " + e6);
        System.out.println("!a6&b6 = " + f6);
        System.out.println("          !a6 = " + g6);



    }
}
