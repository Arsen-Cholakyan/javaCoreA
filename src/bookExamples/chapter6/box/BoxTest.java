package bookExamples.chapter6.box;

import bookExamples.chapter6.box.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        myBox.Width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox1.Width = 3;
        myBox1.height=5;
        myBox1.depth = 9;

        myBox.Vail();
        System.out.println("---------");
        myBox1.Vail();
    }
}
