package myExamples.chapter7.overloadExampleCanstructor;

public class BoxTest {
    public static void main(String[] args) {
   Box  box= new Box();
        System.out.println(box.width + " " + box.length);
        Box box1 = new Box(14,4234);
        System.out.println(box1.width + " " + box1.length);
    }
}
