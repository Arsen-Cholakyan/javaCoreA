package homeworcs.dinamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray();
        myDynamicArray.add(54);
        myDynamicArray.add(1);
        myDynamicArray.add(0);
        myDynamicArray.add(555);
        myDynamicArray.add(43);
        myDynamicArray.add(8888);
        myDynamicArray.add(90);
        int f = myDynamicArray.getByIndex(11);
        System.out.println(f);
        myDynamicArray.add(21);
        myDynamicArray.add(12);
        myDynamicArray.add(76);
        myDynamicArray.add(45);
        myDynamicArray.add(5890);
        myDynamicArray.add(5999);
        myDynamicArray.add(53432);
        myDynamicArray.add(0);
        myDynamicArray.add(1);
        myDynamicArray.add(2);
        myDynamicArray.add(4);
        myDynamicArray.add(2);
        myDynamicArray.add(0);
        myDynamicArray.add(11);
        f = myDynamicArray.getByIndex(11);
        System.out.println(f);
        f = myDynamicArray.getByIndex(21);
        System.out.println(f);
        myDynamicArray.print();
        myDynamicArray.deleteByIndex(5);
        myDynamicArray.print();
        myDynamicArray.deleteByIndex(9);
        myDynamicArray.print();
        myDynamicArray.deleteByIndex(17);
        myDynamicArray.print();
        myDynamicArray.deleteByIndex(17);
        myDynamicArray.set(0,3665);
        myDynamicArray.print();
        myDynamicArray.set(0,554609);
        myDynamicArray.print();
        myDynamicArray.set(17,8766);
        myDynamicArray.add(0,4598);
        myDynamicArray.print();
        myDynamicArray.add(16,6453);
        myDynamicArray.print();
        myDynamicArray.add(15,64732);
        myDynamicArray.print();
        boolean b = myDynamicArray.exists(1);
        System.out.println(b);
        b = myDynamicArray.exists(0);
        System.out.println(b);
        b = myDynamicArray.exists(64732);
        System.out.println(b);
        b = myDynamicArray.exists(54);
        System.out.println(b);
        int i = myDynamicArray.getIndexByValue(1);
        System.out.println(i);
        i = myDynamicArray.getIndexByValue(64732);
        System.out.println(i);
        i = myDynamicArray.getIndexByValue(7453658);
        System.out.println(i);






    }
}
