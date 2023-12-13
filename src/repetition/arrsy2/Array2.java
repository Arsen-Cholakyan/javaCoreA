package repetition.arrsy2;

import java.util.Scanner;

public class Array2 {
    int a = 100;
    String[] s = new String[a+1];

    void printDontMinu(){
        String ars = "";
        for (int i = 0; i < s.length; i++) {
            if (i == 500){
                s[i+1] = "-";
                break;
            }
            s[i] = i+"";
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        int d = 5;
    }
}
