package repetition.delet;

public class DeletElement {
    int[] ars = {315,3647,6,8,32};
    int size = ars.length;


     void asren(int index){
         int g = 0;
         if (ars.length == -1){
             System.out.println("մասիվի մեջ էլեմենտ չկա");
             return;
         }else {
             if (ars.length == 0){
                 System.out.println(ars[0]);
                 return;
             }
         }
         for (int i = 0; i < ars.length; i++) {
             if (i == index){
                 g = i;
             }else {
                 System.out.println("չկա նման ելեմենտ");
             }
         }
         for (int j = g+1; j < ars.length; j++) {
             ars[j-1] = ars[j];
         }
        size--;
    }


    void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(ars[i]);
        }
    }
}
