package classwork.chapter4;

public class FigureExample {
    public static void main(String[] args) {

        //տնայինի ամփոփում 1
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //տնայինի ամփոփում 2
        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //տնայինի ամփոփում 3
        /*
                *
              * *
            * * *
          * * * *
        * * * * *

         * */
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
