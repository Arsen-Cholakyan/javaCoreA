package myExamples.chapter7.overload;

public class OverloadExampleTest {
    static OverloadExample overloadExample = new OverloadExample();
    public static void main(String[] args) {
        overloadExample.number();
        overloadExample.number(333);
        System.out.println(overloadExample.number(54633, "arsen"));
    }
}
