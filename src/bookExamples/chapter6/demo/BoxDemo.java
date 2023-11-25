package bookExamples.chapter6.demo;

import bookExamples.chapter6.box.Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.Width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.Width * myBox.height * myBox.depth;
        System.out.println("обем равно " + vol);
    }
}
