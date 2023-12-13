package repetition.array;



public class Array {
    private int[] numberArray = {125,1,312,34,76};





    public void max(){
        int maxNumber = 0;
        if (numberArray.length == 0){
            System.out.println(numberArray[0]);
        }else {
            for (int i = 0; i <numberArray.length ; i++) {
                if (numberArray[i] > maxNumber){
                    maxNumber = numberArray[i];
                }
            }
        }
        System.out.println(maxNumber);
    }


    public int min(){
        int min = numberArray[0];
        if (numberArray.length == 0){
            System.out.println(numberArray[0]);
        }else {
            for (int i = 1; i < numberArray.length; i++) {
                if (numberArray[i] < min){
                    min = numberArray[i];
                }
            }
        }
        return min;
    }
}
