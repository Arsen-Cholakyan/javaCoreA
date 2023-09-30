package bookExamples;

public class Chapter5P2 {
    public static void main(String[] args) {

        //գրքի օրինակ 1 break-for-ի մեջ
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println("i :" + i);
        }
        System.out.println();

        //գրքի օրինակ 2 break-ը wail-ի մեջ
        int i1 = 0;
        while (i1 < 100) {
            if (i1 == 10) {
                break;
            }
            System.out.println("i1:" + i1);
            i1++;
        }

        //գրքի օրինակ 2 break-ը ներդրված for-ի մեջ
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("цикл завершон");


        //գրքի օրինակ breakleibl-ի 1-ին օրինակ
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператру break");
                    if (t == true) {
                        break second;
                    }
                    System.out.println("этот оператор не будет випалняться");
                }
                System.out.println("этот оператор не будет випалняться");

            }
            System.out.println("этот оператор не будет випалняться");
        }


        //գրքի օրինակ breakleibl-ի 2-րդ օրինակ
        outer:
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("проход" + i + ": ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) {
                        break outer;
                    }
                    System.out.print(j + " ");
                }
                System.out.println("это страка не будет виведится");
            }
        }
        System.out.println("цикл завершон");


        //գրքի continue-ի օրինակ
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println();
        }

        //գրքի continue-ի օրինակ breakLeibl-ների հետ
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();


    }
}
