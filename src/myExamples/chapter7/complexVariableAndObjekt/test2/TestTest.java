package myExamples.chapter7.complexVariableAndObjekt.test2;

public class TestTest {
    public static void main(String[] args) {
        Test test = new Test(345,3);
        System.out.println(test.a + " " +test.b);
        test.numbers(test);
        System.out.println(test.a + " " +test.b);
    }
}
