package bookExamples.chapter6.demo;

import bookExamples.chapter6.box.Box;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;
        double vol2;

        myBox.Width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.Width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox.Width * myBox.height * myBox.depth;
        System.out.println("обем равно " + vol);

        vol2 = myBox2.Width * myBox2.height * myBox2.depth;
        System.out.println("обем равно " + vol2);


        
    }
}
