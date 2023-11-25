package bookExamples.chapter6.box2;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();

        box.setDim(15,20,10);
        box2.setDim(5,9,10);

        System.out.println(box.vail());
        System.out.println(box2.vail());
    }
}
