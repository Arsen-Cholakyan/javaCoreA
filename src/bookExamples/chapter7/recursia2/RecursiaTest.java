package bookExamples.chapter7.recursia2;

public class RecursiaTest {
    public static void main(String[] args) {
      Recursia recursia = new Recursia(5);
        for (int i = 0; i < 10; i++) {
            recursia.printArray(i);

            recursia.printArray(5);
        }
    }
}
