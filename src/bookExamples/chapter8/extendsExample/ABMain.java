package bookExamples.chapter8.extendsExample;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a = b;
        a.setIJ(123,321);
    }
}
