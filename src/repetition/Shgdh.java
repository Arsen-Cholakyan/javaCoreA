package repetition;

public class Shgdh {
    public static void main(String[] args) {
        int[] ars = {677,859,5,343};
        int a = ars[0];
        for (int i = 1; i < ars.length; i++) {
            if (ars[i] > a){
                a = ars[i];
            }
        }
        System.out.println(a);
    }


    private Shgdh(){
    }

}


