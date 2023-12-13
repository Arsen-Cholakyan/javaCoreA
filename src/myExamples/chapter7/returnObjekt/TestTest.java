package myExamples.chapter7.returnObjekt;

public class TestTest {
    public static void main(String[] args) {
        Test test = new Test(34);
        System.out.println(test.a);
        Test ob;
        System.out.println(ob = test.incrByTen());
        System.out.println(ob.a);
        System.out.println(ob);
    }
}
