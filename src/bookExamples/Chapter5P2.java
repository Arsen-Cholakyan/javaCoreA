package bookExamples;

public class Chapter5P2 {
    public static void main(String[] args) {

        //գրքի օրինակ 1 break-for-ի մեջ
        for (int i = 0; i < 100; i++) {
            if ( i == 10){
                break;
            }
            System.out.println("i :" + i);
        }
        System.out.println();

        //գրքի օրինակ 2 break-ը wail-ի մեջ
        int i1 = 0;
        while (i1 < 100){
            if (i1 == 10){
                break;
            }
            System.out.println("i1:"+ i1);
            i1++;
        }


    }
}
