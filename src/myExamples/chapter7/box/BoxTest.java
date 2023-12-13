package myExamples.chapter7.box;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(12,3543,546564);
        Box box1 = new Box(1233,3,546);
        Box box2 = new Box(box,box1);
        System.out.println(box2.wight + " " + box2.dept + " " + box2.hgt);
    }
}
