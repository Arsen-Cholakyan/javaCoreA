package bookExamples.chapter7.box;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(12,4232,1123);
        Box box1 = new Box();
        Box box2 = new Box(box);

        System.out.println(box.wight + " " + box.heg + " " + box.dept);
        System.out.println(box2.wight + " " + box2.heg + " " + box2.dept);
    }
}
