package myExamples.chapter2P2;

public class MyExamplesCh2P2 {

    public static void main(String[] args) {

        //իմ 1 օրինակ
        //ուղակի տեսականորեն 2-ու շարքի հետևի թվերը հավասարեցրեցինք իրար
        System.out.print("##########");
        for (int i = 1; i <= 100; i++) {
            System.out.print(" " + i);
            if (i == 50){
                System.out.println();
            }
        }
        System.out.println();

        //իմ 2 օրինակ
        int a, b, c;
        a = 10;
        b= 20;
        c= a + b;
        System.out.println(" c =" +"'" + c +"'");



        //0 ավոլնորթ է դրա համար առաջին տողը քիչմ առաչ կնգնի
        System.out.println("      ");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i);

            if (i < 100){
                System.out.print(",");
            }
            if (i < 10 ){
                System.out.print(" ");
            }
            if (i == 50){
                System.out.println();
            }
            if (i == 100){
                System.out.println(":");
            }
        }

        //իմ օրինակ 4
        System.out.println("Arsen\nCholakyan");

        //իմ օրինակ 5
        int nam = 10;
        System.out.println(nam);
        nam= nam * nam;
        System.out.println(nam);


        //իմ օրինակ 6
        int ars = 30;
        int arsen = 10;
        int vl = 25;
        int l = 33;
        int y;
        int r;
        y = ars + arsen;
        r =  vl + l;
        System.out.print(y + ",");
        System.out.println(r);
        int b1;
        b1 = y + r;
        System.out.println("բոլոր փոփոխականների արժոքների գումարը = " + b1);
        r = b1 - l;
        System.out.println(r);

        //իմ օրինակ 7
        if (ars > arsen+ 10){
            System.out.println("a մեծ է arsen + 10-ից");
        }

        //իմ օրինակ 8
        for (int i = 0; i < 10; i++) {
            if (i < 9){
                System.out.print(" ");
            }
            System.out.println(i + 1 + " poxos");
        }

        //իմ օրինակ 9
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                System.out.println();
            }
            if (i == 10) {
                System.out.println();
            }
        }
        System.out.println();


        //իմ օրինակ 10
        //ամիսներ
        System.out.println("ամիսներ");
        for (int j = 1; j <= 12 ; j++) {
            if (j == 1){
                System.out.println(j + " ամիս Հունվար");
            }
            if (j == 2){
                System.out.println(j + " ամիս Փետրվար");
            }
            if (j == 3){
                System.out.println(j + " ամիս Մարտ");
            }
            if (j == 4){
                System.out.println(j + " ամիս Ապրել");
            }
            if (j == 5){
                System.out.println(j + " ամիս Մայիս");
            }
            if (j == 6){
                System.out.println(j + " ամիս Հունիս");
            }
            if (j == 7){
                System.out.println(j + " ամիս Հուլիս");
            }
            if (j == 8){
                System.out.println(j + " ամիս Օգոստոս");
            }
            if (j == 9){
                System.out.println(j + " ամիս Սեպտեմբեր");
            }
            if (j == 10){
                System.out.println(j + " ամիս Հոկտեմբեր");
            }
            if (j == 11){
                System.out.println(j + " ամիս Նոյեմբեր");
            }
            if (j == 12){
                System.out.println(j + " ամիս Դեկտեմբեր");
            }
        }
    }
}
