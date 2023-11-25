package bookExamples.chapter6.box1;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.height = 10;
        box.Width = 20;
        box.depth = 15;

        Box myBox1 = new Box();
        myBox1.Width = 5;
        myBox1.height = 3;
        myBox1.depth = 9;


        System.out.println(box.vil());
        System.out.println(myBox1.vil());
    }
}
