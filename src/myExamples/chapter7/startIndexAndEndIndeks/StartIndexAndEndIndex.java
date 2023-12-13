package myExamples.chapter7.startIndexAndEndIndeks;

public class StartIndexAndEndIndex {
      int[] array;

    public int index(int startIndex) {
        startIndex = array[startIndex];
        return startIndex;
    }


    public void index(int endIndex, int startIndex) {
        endIndex = array[endIndex];
        startIndex = array[0];

        System.out.println(startIndex + " " + endIndex);
    }
}
