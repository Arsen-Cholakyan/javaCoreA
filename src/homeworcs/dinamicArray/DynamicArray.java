package homeworcs.dinamicArray;

public class DynamicArray {


    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            System.out.println("մասիվի մեչ տեղ չկա");
            System.out.println("խնդրում ենք մեծացրեկ ձեր մասիվի չապսը");
            extend();
        } else {
            array[size++] = value;
            System.out.println("ավելացվել է " + size + "էլեմենտ");
        }
    }


    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] array2 = new int[20];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        int a = -1;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                a = array[i];
            }
        }
        return a;
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int x : array) {
            System.out.print("|" + x + "|");
        }
    }
}
