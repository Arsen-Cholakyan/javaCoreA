package myExamples.chapter7.publicEndPrivit;

public class AtsTest {
    public static void main(String[] args) {
        Ars  ars = new Ars();
        ars.a = 23;
        System.out.println(ars.a);
        // r- չենք կարող օգտագործել որովհետև privet-է
    }
}
