package homeworcs.braceChecker;

public class Stack {
    int[] array = new int[20];
    int size = -1;


    public void push(int value) {
        if (size == array.length) {
            System.out.println("էլ տեղ չկա");
        } else {
            array[++size] = value;
        }
    }


    public int pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }
}
