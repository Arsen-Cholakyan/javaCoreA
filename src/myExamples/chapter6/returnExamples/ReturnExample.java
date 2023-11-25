package myExamples.chapter6.returnExamples;

public class ReturnExample {

    //1 void մետոդի մջի return-ի օրինակը
    void ars(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3){
                return;
            }
        }
    }

    //2 ինչ, որ մի բան վերադարձնող մեթոդի return-ի օրինակը
     public String al() {
         for (int i = 0; i < 5; i++) {
             if (i == 2){
                 return "alis";
             }
         }
         System.out.println();
         return null;
    }
}
