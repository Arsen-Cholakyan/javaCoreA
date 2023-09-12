package homeworcs.homework1;

public class FigurePainter {

        // 1
        /*

         *
         * *
         * * *
         * * * *
         * * * * *


         * */
        void figureOne(){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        // 2
        /*


         * * * * *
         * * * *
         * * *
         * *
         *

         * */
        void figureTwo(){
            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }





        // 3
        /*

           * * * * *
             * * * *
               * * *
                 * *
                   *

         * */

    void figureTree(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




        //4
        /*

                *
              * *
            * * *
           * * * *
         * * * * *


         * */
        void figureFour(){
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }



        //5
        /*

                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
        */


    void figureFive(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

