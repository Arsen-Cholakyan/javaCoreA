package myExamples.chapter7.startIndexAndEndIndeks;

public class startIndexAndEndIndexTest {
    public static void main(String[] args) {
        StartIndexAndEndIndex startIndexAndEndIndex = new StartIndexAndEndIndex();
      startIndexAndEndIndex.array = new int[]{123, 123,21,213};
        System.out.println(startIndexAndEndIndex.index(3));
        startIndexAndEndIndex.index(startIndexAndEndIndex.array.length-1,0);
    }
}
