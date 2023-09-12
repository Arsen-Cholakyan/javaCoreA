package homeworcs.homework4;

public class Sort {
    public static void main(String[] args) {
        //Այսինքն՝ ունենք մասիվ օրինակ int[] array = {4,7,1,3,9,0,2};
        //Պետք է այնպես դասավորել, որ հետո տպելուց հետո ունենանք հետևյալ հերթականությունը՝ 0,1,2,3,4,7,9

        int[] array = {4,7,1,3,9,0,2};
        if (array.length == 0){
            System.out.println(array[0]);
        }else {
            int number;
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j <array.length ; j++) {
                    if (array[j] > array[j - 1]){
                       number = array[j - 1];
                       array[j- 1] = array[j];
                       array[j] = number;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "");
                if (array.length-1 > i){
                    System.out.print(",");
                }
            }
        }
    }
}
