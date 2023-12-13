package bookExamples.chapter7.recursia2;

public class Recursia {
    int[] wail;
    Recursia(int i){
         wail = new int[i];
    }

   void printArray(int i){
        if (i == 0){
            return;
        }else {
            printArray(i-1);
            System.out.println("[" + (i - 1) + "]" + wail[i - 1]);
        }
   }

}
